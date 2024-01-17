package com.example.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.utils.PageUtils;
import com.example.common.utils.Query;
import com.example.product.dao.CategoryDao;
import com.example.product.entity.CategoryEntity;
import com.example.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1. 查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.组装树形结构

        //2.1 collect class 1
        List<CategoryEntity> level1Menus = categoryEntities.stream()
                .filter((categoryEntity -> categoryEntity.getParentCid() == 0))
                .map(menu -> {
                    menu.setChildren(getChildren(menu, categoryEntities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        
        return level1Menus;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> childrenEntities = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(menu -> {
            menu.setChildren(getChildren(menu, all));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return childrenEntities;
    }

}
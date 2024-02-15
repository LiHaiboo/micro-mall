package com.example.product;

import com.aliyun.oss.OSSClient;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.product.entity.BrandEntity;
import com.example.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Autowired
    BrandService brandService;

    @Test
    public void testUpload() throws FileNotFoundException {
//        String endpoint = "https://oss-us-west-1.aliyuncs.com";
//        String accessKeyId = "LTAI5tRKCdjen3DebGvLNDYu";
//        String accessKeySecret = "uFaC3apVf5As18Iwt8nm5VwS9ZIrK5";
//
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        InputStream inputStream = new FileInputStream("/Users/lihaibo/Downloads/ios-assets/ebay.png");
        ossClient.putObject("micromall-lhb", "test2.png", inputStream);

        ossClient.shutdown();

        System.out.println("上传完成...");
    }

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("保存成功...");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }


}

package com.example.product.vo.response;

import com.example.product.vo.AttrVo;
import lombok.Data;

@Data
public class AttrRespVo extends AttrVo {
    private String catelogName;
    private String groupName;

}

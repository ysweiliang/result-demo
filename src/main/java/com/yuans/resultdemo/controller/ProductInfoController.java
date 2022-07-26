package com.yuans.resultdemo.controller;

import com.yuans.resultdemo.entity.ProductInfo;
import com.yuans.resultdemo.result.ResultVo;
import com.yuans.resultdemo.service.ProductInfoService;
import com.yuans.resultdemo.vo.ProductInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试返回数据封装web类
 * @Author: ys
 * @CreateTime: 2022-07-20  16:24
 */
@RestController
@RequestMapping("/product/product-info")
public class ProductInfoController {

    @Autowired
    ProductInfoService productInfoService;

    @PostMapping("/findByVo")
    public ResultVo findByVo(@Validated @RequestBody ProductInfoVo vo) {
        ProductInfo productInfo = new ProductInfo();
        BeanUtils.copyProperties(vo, productInfo);
        return new ResultVo(productInfo);
    }
}

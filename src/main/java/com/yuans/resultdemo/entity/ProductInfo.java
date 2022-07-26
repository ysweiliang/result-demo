package com.yuans.resultdemo.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: ys
 * @CreateTime: 2022-07-20  17:01
 */
@Data
public class ProductInfo {
    private String productName;
    private BigDecimal productPrice;
    private Integer productStatus;
}

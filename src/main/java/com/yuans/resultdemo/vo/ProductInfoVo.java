package com.yuans.resultdemo.vo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Description:
 * @Author: ys
 * @CreateTime: 2022-07-20  16:37
 */
@Data
public class ProductInfoVo {
    @NotNull(message = "商品名称不允许为空")
    private String productName;

    @Min(value = 0, message = "商品价格不允许为负数")
    private BigDecimal productPrice;

    private Integer productStatus;
}

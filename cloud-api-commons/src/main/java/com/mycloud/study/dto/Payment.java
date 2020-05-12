package com.mycloud.study.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 24513
 */
@Data
@ApiModel
public class Payment implements Serializable {

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "支付序列号")
    private String serial;
}

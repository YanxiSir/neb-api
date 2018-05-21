package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class GasPriceResp implements Serializable {

    @JSONField(name = "gas_price")
    private BigDecimal gasPrice;
}

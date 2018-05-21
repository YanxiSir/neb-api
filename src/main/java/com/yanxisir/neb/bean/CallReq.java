package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CallReq implements Serializable {

    private String from;
    private String to;
    private BigDecimal value;
    private Integer nonce;
    @JSONField(name = "gas_price")
    private BigDecimal gasPrice;
    @JSONField(name = "gas_limit")
    private BigDecimal gasLimit;
    private String type;
}

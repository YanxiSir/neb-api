package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstimateGasReq implements Serializable {

    private String from;
    private String to;
    private BigInteger value;
    private Integer nonce;
    @JSONField(name = "gas_price")
    private BigInteger gasPrice;
    @JSONField(name = "gas_limit")
    private BigInteger gasLimit;

    private String type;
}

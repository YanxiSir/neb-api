package com.yanxisir.neb.bean;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
public class EstimateGasReq extends SendTransactionReq {

    @Builder
    public EstimateGasReq(String from, String to, BigDecimal value, Integer nonce, BigDecimal gasPrice, BigDecimal gasLimit, String type) {
        super(from, to, value, nonce, gasPrice, gasLimit, type);
    }
}

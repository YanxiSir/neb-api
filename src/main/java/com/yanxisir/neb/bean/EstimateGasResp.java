package com.yanxisir.neb.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class EstimateGasResp implements Serializable {

    private BigInteger gas;
    private String err;
}

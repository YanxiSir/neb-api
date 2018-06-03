package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class CallResp implements Serializable {

    private String result;
    @JSONField(name = "execute_err")
    private String executeErr;
    @JSONField(name = "estimate_gas")
    private BigInteger estimateGas;
}

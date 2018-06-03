package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class TransactionReceipt implements Serializable {

    private String hash;
    private String chainId;
    private String from;
    private String to;
    private BigInteger value;
    private Integer nonce;
    private Date timestamp;
    private String type;
    private String data;
    @JSONField(name = "gas_price")
    private BigInteger gasPrice;
    @JSONField(name = "gas_limit")
    private BigInteger gasLimit;
    @JSONField(name = "contract_address")
    private String contractAddress;
    /**
     * Transaction status, 0 failed, 1 success, 2 pending
     */
    private Integer status;
    @JSONField(name = "gas_used")
    private BigInteger gasUsed;
}

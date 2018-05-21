package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class RawTransactionResp implements Serializable {

    @JSONField(name = "txhash")
    private String txHash;

    /**
     * returns only for deploy contract transaction.
     */
    @JSONField(name = "contract_address")
    private String contractAddress;
}

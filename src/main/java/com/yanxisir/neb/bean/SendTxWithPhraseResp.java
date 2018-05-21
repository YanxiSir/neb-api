package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Data
public class SendTxWithPhraseResp implements Serializable {

    private String hash;

    /**
     * returns only for deploy contract transaction.
     */
    @JSONField(name = "contract_address")
    private String contractAddress;
}

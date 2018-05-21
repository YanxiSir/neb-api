package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlockByHashReq implements Serializable {

    private String hash;

    /**
     * If true it returns the full transaction objects, if false only the hashes of the transactions.
     */
    @JSONField(name = "full_fill_transaction")
    private Boolean fullFillTransaction;
}

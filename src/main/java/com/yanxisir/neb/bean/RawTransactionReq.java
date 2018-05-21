package com.yanxisir.neb.bean;

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
public class RawTransactionReq implements Serializable {

    /**
     * The transaction signed value should be return by SignTransactionWithPassphrase.
     */
    private String data;
}

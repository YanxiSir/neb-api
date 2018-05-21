package com.yanxisir.neb.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class AccountStateResp implements Serializable {

    private String balance;
    private Integer nonce;
    private Integer type;
}

package com.yanxisir.neb.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnLockAccountReq implements Serializable {

    private String address;
    private String passphrase;
    private Integer duration;
}

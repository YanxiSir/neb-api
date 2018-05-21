package com.yanxisir.neb.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class Contract implements Serializable {

    private String source;
    private String sourceType;
    private String function;
    private String[] args;
}

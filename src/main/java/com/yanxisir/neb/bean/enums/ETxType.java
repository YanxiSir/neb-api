package com.yanxisir.neb.bean.enums;

/**
 * 交易类型
 *
 * @author YanxiSir
 * @since 2018/5/19
 */
public enum ETxType {

    BINARY("binary"),
    DEPLOY("deploy"),
    CALL("call");

    private String value;

    ETxType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package com.yanxisir.neb.bean.enums;

/**
 * 地址类型
 *
 * @author YanxiSir
 * @since 2018/5/25
 */
public enum EAddrType {

    NORMAL(87), CONTRACT(88);

    private Integer value;

    EAddrType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

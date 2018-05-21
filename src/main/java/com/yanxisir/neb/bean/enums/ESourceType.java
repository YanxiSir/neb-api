package com.yanxisir.neb.bean.enums;

/**
 * source 语言类型。目前支持 js,ts
 *
 * @author YanxiSir
 * @since 2018/5/19
 */
public enum ESourceType {

    JS("js"), TS("ts");

    private String value;

    ESourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package com.yanxisir.neb.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/18
 */
@Data
public class NebResult<T> implements Serializable {
    T result;
}

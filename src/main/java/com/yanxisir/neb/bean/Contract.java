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
public class Contract implements Serializable {

    private String source;
    private String sourceType;
    private String function;
    private String args;
}

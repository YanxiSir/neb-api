package com.yanxisir.neb.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Data
public class DynastyResp implements Serializable {

    private List<String> miners;
}

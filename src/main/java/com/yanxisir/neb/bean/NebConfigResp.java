package com.yanxisir.neb.bean;

import com.google.gson.JsonObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Data
public class NebConfigResp implements Serializable {

    private JsonObject config;
}

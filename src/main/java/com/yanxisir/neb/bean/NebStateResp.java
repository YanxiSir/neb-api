package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YanxiSir
 * @since 2018/5/18
 */
@Data
public class NebStateResp implements Serializable {

    @JSONField(name = "chain_id")
    private Integer chainId;
    private String tail;
    private String lib;
    private Integer height;
    @JSONField(name = "protocol_version")
    private String protocolVersion;
    @JSONField(name = "synchronized")
    private Boolean sync;
    private String version;
}

package com.yanxisir.neb.bean;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class SubscribeResp implements Serializable {

    private String topic;
    private SubData data;

    @Data
    public static class SubData implements Serializable {

        private Integer chainID;
        private String hash;
        private String from;
        private String to;
        private Integer nonce;
        private BigInteger value;
        private Date timestamp;
        @JSONField(name = "gasprice")
        private BigInteger gasPrice;
        @JSONField(name = "gaslimit")
        private BigInteger gasLimit;
        private String type;
    }
}

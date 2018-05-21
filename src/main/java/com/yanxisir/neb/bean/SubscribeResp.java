package com.yanxisir.neb.bean;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
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
        private BigDecimal value;
        private Date timestamp;
        @JSONField(name = "gasprice")
        private BigDecimal gasPrice;
        @JSONField(name = "gaslimit")
        private BigDecimal gasLimit;
        private String type;
    }
}

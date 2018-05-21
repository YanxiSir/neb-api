package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Data
public class EventsByHashResp implements Serializable {

    private List<Event> events;

    @Data
    public static class Event implements Serializable {
        private String topic;
        private SubData data;
    }

    @Data
    public static class SubData implements Serializable {

        private String hash;
        private Integer status;
        @JSONField(name = "gas_used")
        private BigDecimal gasUsed;
        private String error;
    }
}

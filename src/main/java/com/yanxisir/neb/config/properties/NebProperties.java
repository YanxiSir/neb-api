package com.yanxisir.neb.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author YanxiSir
 * @since 2018/5/18
 */
@Data
@ConfigurationProperties(prefix = "neb")
public class NebProperties {

    private final Http http = new Http();

    @Data
    public static class Http {

        private String host;
    }
}

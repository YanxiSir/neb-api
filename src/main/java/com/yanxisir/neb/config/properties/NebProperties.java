package com.yanxisir.neb.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author YanxiSir
 * @since 2018/5/18
 */
@Data
@Component
@ConfigurationProperties(prefix = "neb")
public class NebProperties {

    private String host;
}

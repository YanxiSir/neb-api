package com.yanxisir.neb.bootstrap;

import com.yanxisir.neb.config.properties.NebProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Configuration
@EnableConfigurationProperties(NebProperties.class)
@ComponentScan(basePackages = "com.yanxisir.neb.config")
public class NebApiConfiguration {
}

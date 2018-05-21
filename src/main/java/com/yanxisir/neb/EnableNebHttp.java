package com.yanxisir.neb;

import com.yanxisir.neb.bootstrap.NebApiConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author YanxiSir
 * @since 2018/5/18
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({NebApiConfiguration.class})
public @interface EnableNebHttp {
}

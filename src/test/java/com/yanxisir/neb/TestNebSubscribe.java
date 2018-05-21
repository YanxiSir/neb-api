package com.yanxisir.neb;

import com.yanxisir.neb.bean.SubscribeReq;
import com.yanxisir.neb.service.INebSubscribeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Slf4j
@PropertySource({
        "classpath:application-test.properties"
})
@RunWith(JUnit4ClassRunner.class)
@ComponentScan(basePackages = "com.yanxisir.neb")
@EnableAutoConfiguration
public class TestNebSubscribe {

    @Autowired
    private INebSubscribeService subscribeService;

    @Test
    public void subscribe() {
        SubscribeReq req = SubscribeReq.builder()
                .topics(new String[]{""})
                .build();
        subscribeService.subscribe(req).toBlocking().first().getResult();
    }
}

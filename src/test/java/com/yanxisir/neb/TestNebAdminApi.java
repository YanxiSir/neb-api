package com.yanxisir.neb;

import com.yanxisir.neb.bean.LockAccountReq;
import com.yanxisir.neb.bean.NewAccountReq;
import com.yanxisir.neb.bean.SendTransactionReq;
import com.yanxisir.neb.bean.SendTxWithPhraseReq;
import com.yanxisir.neb.bean.SignHashReq;
import com.yanxisir.neb.bean.SignTxWithPhraseReq;
import com.yanxisir.neb.bean.StartPprofReq;
import com.yanxisir.neb.bean.UnLockAccountReq;
import com.yanxisir.neb.bean.enums.ETxType;
import com.yanxisir.neb.service.INebApiAdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;

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
public class TestNebAdminApi {

    @Autowired
    private INebApiAdminService adminService;

    @Test
    public void nodeInfo() {
        adminService.nodeInfo().toBlocking().first().getResult();
    }

    @Test
    public void accounts() {
        adminService.accounts().toBlocking().first().getResult();
    }

    @Test
    public void newAccount() {
        NewAccountReq req = NewAccountReq.builder()
                .passphrase("123")
                .build();
        adminService.newAccount(req).toBlocking().first().getResult();
    }

    @Test
    public void unLockAccount() {
        UnLockAccountReq req = UnLockAccountReq.builder()
                .address("")
                .passphrase("")
                .duration(10000)
                .build();
        adminService.unLockAccount(req).toBlocking().first().getResult();
    }

    @Test
    public void lockAccount() {
        LockAccountReq req = LockAccountReq.builder()
                .address("")
                .build();
        adminService.lockAccount(req).toBlocking().first().getResult();
    }

    @Test
    public void signTxWithPhrase() {
        SignTxWithPhraseReq req = SignTxWithPhraseReq.builder()
                .passphrase("")
                .transaction(SendTransactionReq.builder()
                        .from("")
                        .to("")
                        .value(new BigDecimal(0))
                        .nonce(1)
                        .gasPrice(new BigDecimal(1))
                        .gasLimit(new BigDecimal(1))
                        .type(ETxType.CALL.getValue())
                        .build())
                .build();
        adminService.signTxWithPhrase(req).toBlocking().first().getResult();
    }

    @Test
    public void sendTxWithPhrase() {
        SendTxWithPhraseReq req = SendTxWithPhraseReq.builder()
                .passphrase("")
                .transaction(SendTransactionReq.builder()
                        .from("")
                        .to("")
                        .value(new BigDecimal(0))
                        .nonce(1)
                        .gasPrice(new BigDecimal(1))
                        .gasLimit(new BigDecimal(1))
                        .type(ETxType.CALL.getValue())
                        .build())
                .build();
        adminService.sendTxWithPhrase(req).toBlocking().first().getResult();
    }

    @Test
    public void sendTransaction() {
        SendTransactionReq req = SendTransactionReq.builder()
                .from("")
                .to("")
                .value(new BigDecimal(0))
                .nonce(1)
                .gasPrice(new BigDecimal(1))
                .gasLimit(new BigDecimal(1))
                .type(ETxType.CALL.getValue())
                .build();
        adminService.sendTransaction(req).toBlocking().first().getResult();
    }

    @Test
    public void signHash() {
        SignHashReq req = SignHashReq.builder()
                .address("")
                .hash("")
                .alg("")
                .build();
        adminService.signHash(req).toBlocking().first().getResult();
    }

    @Test
    public void startPprof() {
        StartPprofReq req = StartPprofReq.builder()
                .listen("")
                .build();
        adminService.startPprof(req).toBlocking().first().getResult();
    }

    @Test
    public void nebConfig() {
        adminService.nebConfig().toBlocking().first().getResult();
    }
}

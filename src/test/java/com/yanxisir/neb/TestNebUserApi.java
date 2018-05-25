package com.yanxisir.neb;

import com.alibaba.fastjson.JSON;
import com.yanxisir.neb.bean.AccountStateReq;
import com.yanxisir.neb.bean.AccountStateResp;
import com.yanxisir.neb.bean.BlockByHashReq;
import com.yanxisir.neb.bean.BlockByHeightReq;
import com.yanxisir.neb.bean.CallReq;
import com.yanxisir.neb.bean.DynastyReq;
import com.yanxisir.neb.bean.EstimateGasReq;
import com.yanxisir.neb.bean.EventsByHashReq;
import com.yanxisir.neb.bean.NebResult;
import com.yanxisir.neb.bean.RawTransactionReq;
import com.yanxisir.neb.bean.TransactionByContractReq;
import com.yanxisir.neb.bean.TransactionReceiptReq;
import com.yanxisir.neb.bean.enums.ETxType;
import com.yanxisir.neb.service.INebApiUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

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
@EnableAutoConfiguration
@EnableNebHttp
public class TestNebUserApi {

    @Autowired
    private INebApiUserService userService;

    @Test
    public void nebState() {
        userService.nebState().toBlocking().first().getResult();
    }


    @Test
    public void accountState() {
        AccountStateReq req = AccountStateReq.builder()
                .address("n1JE2mf65ryVScatTsnP8M9U5c1VSFmzvaZ")
                .build();
        AccountStateResp result = userService.accountState(req).toBlocking().first().getResult();
        log.info("result:{}", JSON.toJSONString(result));
    }

    @Test
    public void lib() {
        userService.lib().toBlocking().first().getResult();
    }

    @Test
    public void call() {
        CallReq req = CallReq.builder()
                .from("")
                .to("")
                .value(new BigDecimal(0))
                .nonce(1)
                .gasPrice(new BigDecimal(1))
                .gasLimit(new BigDecimal(1))
                .type(ETxType.CALL.getValue())
                .build();
        userService.call(req).toBlocking().first().getResult();
    }

    @Test
    public void rawTransaction() {
        RawTransactionReq req = RawTransactionReq.builder()
                .data("")
                .build();
        userService.rawTransaction(req).toBlocking().first().getResult();
    }

    @Test
    public void blockByHash() {
        BlockByHashReq req = BlockByHashReq.builder()
                .hash("e57d6aa65107464726dc03afdd176fd660c993b6cf5dc47fff9d69178b505162")
                .fullFillTransaction(true)
                .build();
        userService.blockByHash(req).toBlocking().first().getResult();
    }

    @Test
    public void blockByHeight() {
        BlockByHeightReq req = BlockByHeightReq.builder()
                .height(123)
                .fullFillTransaction(true)
                .build();
        userService.blockByHeight(req).toBlocking().first().getResult();
    }

    @Test
    public void transactionReceipt() {
        TransactionReceiptReq req = TransactionReceiptReq.builder()
                .hash("")
                .build();
        userService.transactionReceipt(req).toBlocking().first().getResult();
    }

    @Test
    public void transactionByContract() {
        TransactionByContractReq req = TransactionByContractReq.builder()
                .address("")
                .build();
        userService.transactionByContract(req).toBlocking().first().getResult();
    }

    @Test
    public void gasPrice() {
        userService.gasPrice().toBlocking().first().getResult();
    }

    @Test
    public void estimateGas() {
        EstimateGasReq req = EstimateGasReq.builder()
                .from("")
                .to("")
                .value(new BigDecimal(0))
                .nonce(1)
                .gasPrice(new BigDecimal(1))
                .gasLimit(new BigDecimal(1))
                .type(ETxType.CALL.getValue())
                .build();
        userService.estimateGas(req).toBlocking().first();
    }

    @Test
    public void eventsByHash() {
        EventsByHashReq req = EventsByHashReq.builder()
                .hash("")
                .build();
        userService.eventsByHash(req).toBlocking().first().getResult();
    }

    @Test
    public void dynasty() {
        DynastyReq req = DynastyReq.builder()
                .height(123)
                .build();
        userService.dynasty(req).toBlocking().first().getResult();
    }

}

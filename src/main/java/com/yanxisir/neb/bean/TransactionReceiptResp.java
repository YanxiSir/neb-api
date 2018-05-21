package com.yanxisir.neb.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
@Data
public class TransactionReceiptResp extends TransactionReceipt {

    @JSONField(name = "execute_error")
    private String executeError;

    @JSONField(name = "execute_result")
    private String executeResult;
}

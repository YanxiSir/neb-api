package com.yanxisir.neb.service;

import com.yanxisir.neb.bean.LockAccountReq;
import com.yanxisir.neb.bean.NebResult;
import com.yanxisir.neb.bean.NewAccountReq;
import com.yanxisir.neb.bean.SendTransactionReq;
import com.yanxisir.neb.bean.SendTxWithPhraseReq;
import com.yanxisir.neb.bean.SignHashReq;
import com.yanxisir.neb.bean.SignTxWithPhraseReq;
import com.yanxisir.neb.bean.StartPprofReq;
import com.yanxisir.neb.bean.UnLockAccountReq;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * https://github.com/nebulasio/wiki/blob/master/rpc_admin.md
 *
 * @author YanxiSir
 * @since 2018/5/19
 */
public interface INebApiAdminService {

    @GET("/v1/admin/nodeinfo")
    Observable<NebResult> nodeInfo();

    @GET("/v1/admin/accounts")
    Observable<NebResult> accounts();

    @POST("/v1/admin/account/new")
    Observable<NebResult> newAccount(@Body NewAccountReq req);

    @POST("/v1/admin/account/unlock")
    Observable<NebResult> unLockAccount(@Body UnLockAccountReq req);

    @POST("/v1/admin/account/lock")
    Observable<NebResult> lockAccount(@Body LockAccountReq req);

    @POST("/v1/admin/sign")
    Observable<NebResult> signTxWithPhrase(@Body SignTxWithPhraseReq req);

    @POST("/v1/admin/transactionWithPassphrase")
    Observable<NebResult> sendTxWithPhrase(@Body SendTxWithPhraseReq req);

    @POST("/v1/admin/transaction")
    Observable<NebResult> sendTransaction(@Body SendTransactionReq req);

    @POST("/v1/admin/sign/hash")
    Observable<NebResult> signHash(@Body SignHashReq req);

    @POST("/v1/admin/pprof")
    Observable<NebResult> startPprof(@Body StartPprofReq req);

    @GET("/v1/admin/getConfig")
    Observable<NebResult> nebConfig();
}

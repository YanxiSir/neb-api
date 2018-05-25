package com.yanxisir.neb.service;

import com.yanxisir.neb.bean.*;
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
    Observable<NebResult<NodeInfoResp>> nodeInfo();

    @GET("/v1/admin/accounts")
    Observable<NebResult<AccountsResp>> accounts();

    @POST("/v1/admin/account/new")
    Observable<NebResult<NewAccountResp>> newAccount(@Body NewAccountReq req);

    @POST("/v1/admin/account/unlock")
    Observable<NebResult<UnLockAccountResp>> unLockAccount(@Body UnLockAccountReq req);

    @POST("/v1/admin/account/lock")
    Observable<NebResult<LockAccountResp>> lockAccount(@Body LockAccountReq req);

    @POST("/v1/admin/sign")
    Observable<NebResult<SignTxWithPhraseResp>> signTxWithPhrase(@Body SignTxWithPhraseReq req);

    @POST("/v1/admin/transactionWithPassphrase")
    Observable<NebResult<SendTxWithPhraseResp>> sendTxWithPhrase(@Body SendTxWithPhraseReq req);

    @POST("/v1/admin/transaction")
    Observable<NebResult<SendTransactionResp>> sendTransaction(@Body SendTransactionReq req);

    @POST("/v1/admin/sign/hash")
    Observable<NebResult<SignHashResp>> signHash(@Body SignHashReq req);

    @POST("/v1/admin/pprof")
    Observable<NebResult<StartPprofResp>> startPprof(@Body StartPprofReq req);

    @GET("/v1/admin/getConfig")
    Observable<NebResult<NebConfigResp>> nebConfig();
}

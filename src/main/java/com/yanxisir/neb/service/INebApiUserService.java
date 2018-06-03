package com.yanxisir.neb.service;

import com.yanxisir.neb.bean.*;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * https://github.com/nebulasio/wiki/blob/master/rpc.md
 *
 * @author YanxiSir
 * @since 2018/5/18
 */
public interface INebApiUserService {

    @GET("/v1/user/nebstate")
    Observable<NebResult<NebStateResp>> nebState();

    @POST("/v1/user/accountstate")
    Observable<NebResult<AccountStateResp>> accountState(@Body AccountStateReq req);

    @GET("/v1/user/lib")
    Observable<NebResult<LatestIrreversibleBlockResp>> lib();

    @POST("/v1/user/call")
    Observable<CallResp> call(@Body CallReq req);

    @POST("/v1/user/rawtransaction")
    Observable<NebResult<RawTransactionResp>> rawTransaction(@Body RawTransactionReq req);

    @POST("/v1/user/getBlockByHash")
    Observable<NebResult<BlockByHashResp>> blockByHash(@Body BlockByHashReq req);

    @POST("/v1/user/getBlockByHeight")
    Observable<NebResult<BlockByHeightResp>> blockByHeight(@Body BlockByHeightReq req);

    @POST("/v1/user/getTransactionReceipt")
    Observable<NebResult<TransactionReceiptResp>> transactionReceipt(@Body TransactionReceiptReq req);

    @POST("/v1/user/getTransactionByContract")
    Observable<NebResult<TransactionByContractResp>> transactionByContract(@Body TransactionByContractReq req);

    @GET("/v1/user/getGasPrice")
    Observable<NebResult<GasPriceResp>> gasPrice();

    @POST("/v1/user/estimateGas")
    Observable<EstimateGasResp> estimateGas(@Body EstimateGasReq req);

    @POST("/v1/user/getEventsByHash")
    Observable<NebResult<EventsByHashResp>> eventsByHash(@Body EventsByHashReq req);

    @POST("/v1/user/dynasty")
    Observable<NebResult<DynastyResp>> dynasty(@Body DynastyReq req);
}

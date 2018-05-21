package com.yanxisir.neb.service;

import com.yanxisir.neb.bean.AccountStateReq;
import com.yanxisir.neb.bean.BlockByHashReq;
import com.yanxisir.neb.bean.BlockByHeightReq;
import com.yanxisir.neb.bean.CallReq;
import com.yanxisir.neb.bean.CallResp;
import com.yanxisir.neb.bean.DynastyReq;
import com.yanxisir.neb.bean.EstimateGasReq;
import com.yanxisir.neb.bean.EstimateGasResp;
import com.yanxisir.neb.bean.EventsByHashReq;
import com.yanxisir.neb.bean.NebResult;
import com.yanxisir.neb.bean.RawTransactionReq;
import com.yanxisir.neb.bean.TransactionByContractReq;
import com.yanxisir.neb.bean.TransactionReceiptReq;
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
    Observable<NebResult> nebState();

    @POST("/v1/user/accountstate")
    Observable<NebResult> accountState(@Body AccountStateReq req);

    @GET("/v1/user/lib")
    Observable<NebResult> lib();

    @POST("/v1/user/call")
    Observable<CallResp> call(@Body CallReq req);

    @POST("/v1/user/rawtransaction")
    Observable<NebResult> rawTransaction(@Body RawTransactionReq req);

    @POST("/v1/user/getBlockByHash")
    Observable<NebResult> blockByHash(@Body BlockByHashReq req);

    @POST("/v1/user/getBlockByHeight")
    Observable<NebResult> blockByHeight(@Body BlockByHeightReq req);

    @POST("/v1/user/getTransactionReceipt")
    Observable<NebResult> transactionReceipt(@Body TransactionReceiptReq req);

    @POST("/v1/user/getTransactionByContract")
    Observable<NebResult> transactionByContract(@Body TransactionByContractReq req);

    @GET("/v1/user/getGasPrice")
    Observable<NebResult> gasPrice();

    @POST("/v1/user/estimateGas")
    Observable<EstimateGasResp> estimateGas(@Body EstimateGasReq req);

    @POST("/v1/user/getEventsByHash")
    Observable<NebResult> eventsByHash(@Body EventsByHashReq req);

    @POST("/v1/user/dynasty")
    Observable<NebResult> dynasty(@Body DynastyReq req);
}

package com.yanxisir.neb.service;

import com.yanxisir.neb.bean.NebResult;
import com.yanxisir.neb.bean.SubscribeReq;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * @author YanxiSir
 * @since 2018/5/19
 */
public interface INebSubscribeService {

    @POST("/v1/user/subscribe")
    Observable<NebResult> subscribe(@Body SubscribeReq req);
}

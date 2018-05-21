package com.yanxisir.neb.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.yanxisir.neb.config.properties.NebProperties;
import com.yanxisir.neb.service.INebApiAdminService;
import com.yanxisir.neb.service.INebApiUserService;
import com.yanxisir.neb.service.INebSubscribeService;
import okhttp3.ConnectionPool;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * @author YanxiSir
 * @since 2018/5/21
 */
@Configuration
public class HttpConfig {

    @Autowired
    private NebProperties nebProperties;

//    @Value("${neb.host}")
//    private String hostUrl;

    @Scope
    @Bean
    public INebApiUserService createNebApiUserService(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
//                .baseUrl(hostUrl)
                .baseUrl(nebProperties.getHost())
                .addConverterFactory(new ConverterFactoryWithSerialization<>())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(INebApiUserService.class);
    }

    @Scope
    @Bean
    public INebApiAdminService createNebApiAdminService(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(nebProperties.getHost())
//                .baseUrl(hostUrl)
                .addConverterFactory(new ConverterFactoryWithSerialization<>())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(INebApiAdminService.class);
    }

    @Scope
    @Bean
    public INebSubscribeService createNebSubscribeService(OkHttpClient client) {
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(nebProperties.getHost())
//                .baseUrl(hostUrl)
                .addConverterFactory(new ConverterFactoryWithSerialization<>())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(INebSubscribeService.class);
    }


    @Scope
    @Bean
    public OkHttpClient createDefaultOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .connectionPool(new ConnectionPool(50, 5, MINUTES))
                .connectTimeout(1, MINUTES)
                .readTimeout(2, MINUTES)
                .writeTimeout(1, MINUTES);
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(interceptor);
        return builder.build();
    }

    public static class ConverterFactoryWithSerialization<T extends Serializable> extends Converter.Factory {
        @Override
        public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
            return (Converter<T, RequestBody>) t -> {
                SerializeConfig jsonConfig = new SerializeConfig();
                FormBody.Builder formBuilder = new FormBody.Builder();
                JSONObject jsonMap = (JSONObject) JSON.parse(JSON.toJSONString(t, jsonConfig));
                jsonMap.forEach((key, value) -> formBuilder.add(key, JSON.toJSONString(value, jsonConfig)));
                return formBuilder.build();
            };
        }

        @Override
        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
            return new ResponseBodyConverter<>(type);

        }

        public class ResponseBodyConverter<T> implements Converter<ResponseBody, T> {

            private final Type type;

            public ResponseBodyConverter(Type type) {
                this.type = type;
            }

            @Override
            public T convert(ResponseBody responseBody) throws IOException {
                String responseJson = responseBody.string();
                return JSONObject.parseObject(responseJson, type);
            }
        }
    }
}

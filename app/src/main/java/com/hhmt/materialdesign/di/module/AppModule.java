package com.hhmt.materialdesign.di.module;

import com.hhmt.materialdesign.net.http.ApiService;
import com.hhmt.materialdesign.utils.GConstDef;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  15:43
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.di.module
 * project   : MaterialDesign
 */

@Module
public class AppModule {

    @Singleton
    @Provides
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(GConstDef.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(provideOkHttpClient())
                .build();
    }

    @Singleton
    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder()
                .readTimeout(GConstDef.NET_READ_DEFAULT_TIME, TimeUnit.MILLISECONDS)
                .writeTimeout(GConstDef.NET_WRITE_DEFAULT_TIME, TimeUnit.MILLISECONDS)
                .connectTimeout(GConstDef.NET_CONNECT_DEFAULT_TIME, TimeUnit.MILLISECONDS)
                .build();
    }

    @Singleton
    @Provides
    public ApiService provideService() {
        return provideRetrofit().create(ApiService.class);
    }

}

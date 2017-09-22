package com.hhmt.materialdesign.net.http;

import com.hhmt.materialdesign.net.response.RecommendResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  15:32
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.net.http
 * project   : MaterialDesign
 */

public interface ApiService {

    @GET("feed-app")
    Observable<RecommendResponse> getRecommend();

}

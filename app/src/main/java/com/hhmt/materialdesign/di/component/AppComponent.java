package com.hhmt.materialdesign.di.component;

import com.hhmt.materialdesign.app.App;
import com.hhmt.materialdesign.di.module.AppModule;
import com.hhmt.materialdesign.net.http.ApiService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  16:19
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.di.component
 * project   : MaterialDesign
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    ApiService provideApiService();

}

package com.hhmt.materialdesign.app;

import android.app.Application;

import com.hhmt.materialdesign.di.component.AppComponent;
import com.hhmt.materialdesign.di.component.DaggerAppComponent;
import com.hhmt.materialdesign.di.module.AppModule;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  16:24
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.app
 * project   : MaterialDesign
 */

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}

package com.hhmt.materialdesign.di.annotation;

import android.support.annotation.LayoutRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author    : yangshaopeng
 * email     : ysp@btomorrow.cn
 * date      : 2017/09/21  19:32
 * desc      : <p> </p>
 * package   : com.hhmt.materialdesign.di.annotation
 * project   : MaterialDesign
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LayoutResource {
    @LayoutRes int value() default 0;
}

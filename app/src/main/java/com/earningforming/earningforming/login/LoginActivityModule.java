package com.earningforming.earningforming.login;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule { LoginActivityPresenter loginActivityPresenter;
    Context context;

    public LoginActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public LoginActivityPresenter providesLoginActivityPresenter(Context context){
        return new LoginActivityPresenter(context);
    }
    @Provides
    @Singleton
    public Context providesContext(){
        return context;
    }
}

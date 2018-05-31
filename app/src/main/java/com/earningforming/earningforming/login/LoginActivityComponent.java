package com.earningforming.earningforming.login;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {LoginActivityModule.class})
public interface LoginActivityComponent {
    void inject(LoginActivity target);
}

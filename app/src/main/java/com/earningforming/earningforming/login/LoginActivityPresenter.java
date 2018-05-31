package com.earningforming.earningforming.login;

import android.content.Context;
import android.widget.Toast;

public class LoginActivityPresenter implements LoginActivityMVP.Presenter{
    Context context;
    LoginActivityMVP.View view;

    public LoginActivityPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void toastMake() {
        Toast.makeText(context, "Hey hey", Toast.LENGTH_SHORT).show();
    }
}

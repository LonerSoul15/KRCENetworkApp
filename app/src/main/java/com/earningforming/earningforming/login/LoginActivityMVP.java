package com.earningforming.earningforming.login;

public interface LoginActivityMVP {
    interface View{

    }
    interface Presenter{
        void setView(LoginActivityMVP.View view);
        void toastMake();

    }
    interface Model{

    }
}

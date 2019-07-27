package com.example.loginwithmvp;

import android.content.Context;

public class Presenter {
    IOnLogin iOnLogin;
    Context context;

    public Presenter(IOnLogin iLogin, Context context) {
        this.iOnLogin = iLogin;
        this.context = context;
    }

    public void onLogin(String user,String pass){

        if (user.equals("haint")&&pass.equals("12345")){
            iOnLogin.onSuccessFul();
        }else iOnLogin.onMessenger("User or pass không đúng");

    }
}

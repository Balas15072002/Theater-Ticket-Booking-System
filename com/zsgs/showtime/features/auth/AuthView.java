package com.zsgs.showtime.features.auth;

public class AuthView {
    private final AuthModel model;

    public AuthView(){
        model=new AuthModel(this);
    }
}

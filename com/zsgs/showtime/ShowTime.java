package com.zsgs.showtime;

import com.zsgs.showtime.features.auth.AuthView;

public class ShowTime {

    public static final String appVersion = "0.0.1";
    public static final String appName = "ShowTime";

    public static void main(String[] args) {
        System.out.println("Welcome to " + appName + " - Version: " + appVersion);
        new AuthView().init();
    }
}

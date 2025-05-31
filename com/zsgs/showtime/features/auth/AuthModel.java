package com.zsgs.showtime.features.auth;

import com.zsgs.showtime.repository.db.ShowTimeDB;
import com.zsgs.showtime.repository.dto.RegistrationInfo;

class AuthModel {
    private final AuthView view;

    public AuthModel(AuthView authView) {
        view = authView;
    }

    void init() {
        if (ShowTimeDB.getInstance().getRegistrationInfo() != null) {
            view.proceedLogin();
        } else {
            view.proceedRegistration();
        }
    }

    void registerUser(RegistrationInfo info) {
        if (isAlreadyExist(info.getUserName())) {
            view.showErrorMessage("Username already Exist");
        } else if (isWeakPassword()) {
            view.showErrorMessage("Please enter strong password");
        } else {
            ShowTimeDB.getInstance().setRegistrationInfo(info);
            view.onRegistrationSuccess(info);
        }
    }

    private boolean isWeakPassword() {
        return false; // Write your logics here
    }

    private boolean isAlreadyExist(String userName) {
        return false;
    }

    public void validateCredentials(String userName, String password) {
        if (ShowTimeDB.getInstance().validateLoginInfo(userName, password)) {
            view.onSuccessLogin(userName);
        } else {
            view.onInvalidCredentials();
        }
    }
}

package com.zsgs.showtime.repository.db;

import com.zsgs.showtime.repository.dto.RegistrationInfo;

public class ShowTimeDB {
    private static ShowTimeDB sShowTimeDB;

    private ShowTimeDB() {

    }

    public static ShowTimeDB getInstance() {
        if (sShowTimeDB == null) {
            sShowTimeDB = new ShowTimeDB();
        }
        return sShowTimeDB;
    }

    private RegistrationInfo registrationInfo;

    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public boolean validateLoginInfo(String userName, String password) {
        return registrationInfo.getUserName().equals(userName) && registrationInfo.getPassword().equals(password);
    }
}

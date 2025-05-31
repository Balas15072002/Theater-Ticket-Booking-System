package com.zsgs.showtime.features.auth;

import com.zsgs.showtime.repository.dto.RegistrationInfo;

import java.util.Scanner;

public class AuthView {
    private final AuthModel model;
    private final Scanner scan = new Scanner(System.in);

    public AuthView() {
        model = new AuthModel(this);
    }

    public void init() {
        model.init();
    }

    private String getName() {
        String userName = "";
        System.out.print("Enter name: ");
        do {
            userName = scan.nextLine();
            if (userName.length() < 3 || userName.length() > 50)
                System.out.print("Name should not be empty and length min 3 and Max 50\n\nEnter valid name: ");
            else
                break;
        } while (true);
        return userName;
    }

    private String getUserName(String initialInfo, String errorInfo) {
        String userName = "";
        System.out.print(initialInfo);
        do {
            userName = scan.nextLine();
            if (userName.length() < 3 || userName.length() > 20)
                System.out.print(errorInfo);
            else
                break;
        } while (true);
        return userName;
    }

    private String getPassword() {
        String password = "";
        System.out.print("Enter password: ");
        do {
            password = scan.nextLine();
            if (password.length() < 8 || password.length() > 32)
                System.out.print("Password should not be empty and length min 8 and max 32\n\nEnter valid password: ");
            else
                break;
        } while (true);
        System.out.print("Confirm Password: ");
        do {
            String confirmPassword = scan.nextLine();
            if (!password.equals(confirmPassword))
                System.out.print("Password did not match.\n\nEnter confirm password again: ");
            else
                break;
        } while (true);
        return password;
    }

    private String getPasswordForLogin() {
        String password = "";
        System.out.print("Enter password: ");
        do {
            password = scan.nextLine();
            if (password.length() < 8 || password.length() > 32)
                System.out.print("Enter valid password: ");
            else
                break;
        } while (true);
        return password;
    }

    public void proceedRegistration() {
        System.out.println("Please provide the following info for registration");
        RegistrationInfo info = new RegistrationInfo();
        info.setFirstName(getName());
        info.setUserName(getUserName("Enter User name: ", "username should not be empty and length min 3 and max 20\n\nEnter valid username: "));
        info.setPassword(getPassword());
        model.registerUser(info);
    }

    public void showErrorMessage(String usernameAlreadyExist) {
        System.out.println(usernameAlreadyExist);
        proceedRegistration();
    }

    public void onRegistrationSuccess(RegistrationInfo info) {
        System.out.println("Registration Successfully!");
        init();
    }

    public void proceedLogin() {
        model.validateCredentials(getUserName("Enter user name for login: ", "Enter valid user name: "), getPasswordForLogin());
    }

    public void onSuccessLogin(String userName) {
        System.out.println("Logged in successfully|");
        System.out.println("Welcome " + userName);
        //Under development
    }

    public void onInvalidCredentials() {
        System.out.println("Username and password did not match");
        System.out.println("Do you want to proceed? Type Y or N");
        if (scan.nextLine().equalsIgnoreCase("Y")) {
            proceedLogin();
        }
    }
}

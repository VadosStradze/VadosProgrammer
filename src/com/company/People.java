package com.company;


public class People {
    private String Login;
    private String Password;

    void info (){//todo create
        System.out.println("User information:");
        System.out.println("User login: " + Login +  "/n User Password " + Password);
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public String toString(){
        return this.getLogin();
    }
}

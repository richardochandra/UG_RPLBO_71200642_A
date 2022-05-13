package com.twitter;

public class LoginException extends Exception{
    private int code;
    private String message;

    public LoginException(int code){
        this.code = code;
        if (code == 1){
            this.message = "Username tidak boleh kosong";
        }
        else if (code == 2){
            this.message = "Password tidak boleh kosong";
        }
        else if (code == 3){
            this.message = "Maaf, username atau password salah! Silahkan coba lagi";
        }
    }

    public String getMessage() {
        return message;
    }
}

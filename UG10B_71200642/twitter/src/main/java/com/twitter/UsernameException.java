package com.twitter;

public class UsernameException extends Exception {
    private int code;
    private String message;

    public UsernameException(int code){
        this.code = code;
        if (code == 1){
            this.message = "Input username tidak boleh kosong";
        }
        else if (code == 2){
            this.message = "Username minimal harus terdiri dari 6 karakter";
        }
        else if (code == 3) {
            this.message = "Username hanya boleh terdiri dari huruf, angka, dan simbol underscore";
        }
    }
    public String getMessage() {
        return message;
    }
}


package com.twitter;

public class TweetException extends Exception{
    private int code;
    private String message;

    public TweetException(int code){
        this.code = code;
        if (code == 1 ){
            this.message = "Input tweet tidak boleh kosong";
        }
        else if (code == 2 ){
            this.message = "Tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter";
        }
    }

    public String getMessage() {
        return message;
    }
}

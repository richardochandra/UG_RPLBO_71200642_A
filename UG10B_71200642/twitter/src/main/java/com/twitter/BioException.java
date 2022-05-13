package com.twitter;

public class BioException extends Exception{
    private int code;
    private String message;

    public BioException(int code){
        this.code = code ;
        if (code == 1){
            this.message = "Input bio tidak boleh kosong";
        }
        else if (code == 2){
            this.message = "Nio minimal harus terdiri dari 5 karakter dan maksimal 30 karakter";
        }
        else if (code == 3){
            this.message = "Bio tidak boleh mengandung karakter spesial selain titik, @, serta spasi";
        }
    }
    public String getMessage() {
        return message;
    }
}

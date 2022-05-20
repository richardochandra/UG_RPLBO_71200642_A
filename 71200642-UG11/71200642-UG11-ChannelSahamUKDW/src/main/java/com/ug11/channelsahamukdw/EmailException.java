package com.ug11.channelsahamukdw;

public class EmailException extends Throwable {
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode) {
        if (errorCode == 1) {
            this.errorMessage = "Login gagal! Email Anda tidak terdaftar dalam UKDW.";
        } else if (errorCode == 2) {
            this.errorMessage = "Login gagal! email UKDW Anda tidak valid";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

package com.twitter;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        boolean stat = false;
        String bio = null;
        User user = new User("u71200642", "p71200642");
        Scanner inp = new Scanner(System.in);
        System.out.println("Selamat datang di Twitter");
        System.out.println("Silahkan login dengan akun anda\n");


        while (stat == false) {
            System.out.print("Username: ");
            String usernameinp = inp.nextLine();
            System.out.print("Password: ");
            String passwordinp = inp.nextLine();


            try {
                if (usernameinp.isEmpty()) {
                    throw new LoginException(1);
                } else if (passwordinp.isEmpty()) {
                    throw new LoginException(2);
                } else if (!usernameinp.equals(user.getUsername()) || !passwordinp.equals(user.getPassword())) {
                    throw new LoginException(3);
                } else {
                    System.out.println("Selamat datang di Twitter, " + user.getUsername());
                    stat = true;
                }

            } catch (LoginException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Kamu diminta mengganti username silahkan masukan username kamu");



        while (stat == true){
            System.out.print("Username: ");
            String usernameinp = inp.nextLine();
            Pattern a = Pattern.compile("^[a-zA-Z0-9_]{0,}$");
            Matcher b = a.matcher(usernameinp);
            boolean syarat = b.matches();
            try{
                if (usernameinp.isEmpty()){
                    throw new UsernameException(1);
                }
                else if (usernameinp.length()<6){
                    throw new UsernameException(2);
                }
                else if (syarat == false){
                    throw new UsernameException(3);
                }
                else{
                    user.setUsername(usernameinp);
                    System.out.println("Username kamu berhasil diperbaharui, "+user.getUsername());
                    stat =false;
                }
            } catch (UsernameException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Maaf, "+user.getUsername()+" kamu juga diminta untuk mengisi bio, silahkan masukan bio kamu");

        while (stat == false){

            System.out.print("Bio: ");
            String bioinp = inp.nextLine();
            Pattern a = Pattern.compile("^[a-zA-Z0-9.@ ]{0,}$");
            Matcher b = a.matcher(bioinp);
            boolean syarat = b.matches();
            try {
                if (bioinp.isEmpty()){
                    throw new BioException(1);
                }
                else if (bioinp.length()<5 || bioinp.length()>30){
                    throw new BioException(2);
                }
                else if (syarat == false){
                        throw new BioException(3);
                }
                else {
                    System.out.println("Bio kamu berhasil diperbaharui, "+ bioinp);
                    stat = true;
                    bio = bioinp;
                }
            } catch (BioException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Selamat, "+user.getUsername()+" kamu sudah dapat memposting tweet pertama kamu");
        while (stat == true){
            System.out.print("Tweet: ");
            String tweetinp = inp.nextLine();
            try {
                if (tweetinp.isEmpty()){
                    throw new TweetException(1);
                }
                else if (tweetinp.length()<8 || tweetinp.length()>140){
                    throw new TweetException(2);
                }
                else {
                    stat=false;
                    System.out.println("@"+user.getUsername()+": "+tweetinp);
                }
            } catch (TweetException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("Username: "+ user.getUsername());
        System.out.println("Password: "+user.getPassword());
        System.out.println("Bio: "+bio);
    }
}

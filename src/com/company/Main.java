package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username : ");
        userName = input.nextLine();

        System.out.print("Enter Password : ");
        password = input.nextLine();


        if (userName.equals("berkay")&& password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş Başarısız");
        }
    }
}

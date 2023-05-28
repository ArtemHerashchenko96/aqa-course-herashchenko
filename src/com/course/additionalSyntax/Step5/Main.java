package com.course.additionalSyntax.Step5;

import com.course.additionalSyntax.Step3.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String password;
        String email;
        while (true) {
            System.out.println("add|print|exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()){
                case "add" -> {
                    System.out.println("Please, type your email: ");
                    email = scanner.nextLine();
                    System.out.println("Please, type your password: ");
                    password = scanner.nextLine();
                    Step5Users user = new Step5Users(email, password);
                    user.add();
                }
                case "print" -> {
                    Step5Users.print();
                }
                case "exit" -> {
                    return;
                }
            }
        }
    }
}

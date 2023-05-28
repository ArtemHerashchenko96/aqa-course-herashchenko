package com.course.additionalSyntax.Step5;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Step5Users {
    private static int id;
    private String email, password;
    private final static String USERS_FILE = "users.csv";

    public Step5Users (String email, String password){
        this.email = email;
        this.password = password;
        id++;
    }
    public void add() throws Exception{
        FileWriter fw = new FileWriter(USERS_FILE, true);
        fw.append(this.userData() + "\n");
        System.out.println("User was successfully added!");
        fw.close();
    }
    public static void print() throws Exception{
        FileReader fr = new FileReader(USERS_FILE);
        Scanner scanner = new Scanner(fr);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        fr.close();
        scanner.close();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    private String userData() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

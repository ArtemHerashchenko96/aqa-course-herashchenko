package com.course.additionalSyntax.Step3;

import java.util.ArrayList;
import java.util.List;
public class Broker implements PrintInfo {
    private String name, email, phoneNumber;
    private List<User> clientsList;

    public Broker(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.clientsList = new ArrayList<>();
        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        } else System.out.println("Error! The phone number must start from +");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<User> getClientsList() {
        return clientsList;
    }
    public void addClient(User user) {
        clientsList.add(user);
    }

    @Override
    public String toString() {
        return "Broker{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", clientsList=" + clientsList +
                '}';
    }
    public void printInfo() {
        System.out.println(toString());
    }
}

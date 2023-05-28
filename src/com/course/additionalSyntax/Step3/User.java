package com.course.additionalSyntax.Step3;

import java.util.ArrayList;

public class User implements PrintInfo {
    private static int id = 1;
    private String firstName, lastName, fullName, email, phoneNumber, billingAddress, deliveryAddress, manager;
    private ArrayList<Card> cards;
    private Role role;

    public User(String fullName, String email, Role role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.cards = new ArrayList<>();
        id++;
    }

    public User(String firstName, String lastName, String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.fullName = firstName + " " + lastName;
        this.cards = new ArrayList<>();
        id++;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        } else System.out.println("Error! The phone number must start from +");
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public static int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getManager() {
        return manager;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", manager='" + manager + '\'' +
                ", cards=" + cards +
                ", role=" + role +
                '}';
    }

    public void printInfo() {
        System.out.println(toString());
    }

    public void printAllCardNumbers() {
        System.out.println("Card Numbers:");
        cards.forEach(card -> System.out.println(card.getNumber()));
    }
}

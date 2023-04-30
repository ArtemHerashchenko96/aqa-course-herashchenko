package com.course.oop;

import java.util.ArrayList;

public class User {
    private String firstName, lastName,phoneNumber, fullName, email, billingAddress, deliveryAddress, manager, roleType;
    private Cards card;
    private ArrayList<Cards> cardsList;
    private Role role = new Role(false, false, false, false);
    private int id;
    private static int nextId = 1;

    public User (String fullName, String email, String roleType) {
        this.fullName = fullName;
        this.email = email;
        this.role = role.createRole(roleType);
        String[]arr1 = fullName.split(" ");
        this.firstName = arr1[0];
        this.lastName = arr1[1];
        this.id = nextId;
        this.roleType = roleType;
        nextId++;
    }
    public User (String firstName, String lastName, String email, String roleType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role.createRole(roleType);
        this.fullName = firstName + " " + lastName;
        this.id = nextId;
        this.roleType = roleType;
        nextId++;
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

    public void setPhoneNumber(String phoneNumber) {
        String firstChar = phoneNumber.substring(0, 1);
        if (firstChar.equals("+")) {
            this.phoneNumber = phoneNumber;
        } else System.out.println("Error! The phone number must start with the '+' symbol");
    }

    public void setCards(Cards card) {
        this.card = card;
    }
    public void addCard(Cards card) {
        if (cardsList == null) {
            cardsList = new ArrayList<>();
        }
        cardsList.add(card);
    }

    public int getId() {
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

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Role getRole() {
        return role;
    }

    public String getManager() {
        return manager;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Cards getCard() {
        return card;
    }
    public ArrayList<Cards> getCardsList() {
        return cardsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", role='" + roleType + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
    public void printUserInfo() {
        System.out.println(toString());
    }

}

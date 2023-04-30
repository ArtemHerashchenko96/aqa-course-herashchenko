package com.course.oop;

public class Address {
    private String country, city, street, building, room;
    private int id, zipCode;
    private static int nextId = 1;

    public Address(String country, String city, String street, String building, int zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public int getId() {
        return id;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

package com.course.additionalSyntax.Step3;

public class Address {
    private static int id = 1;
    private String country, city, street, building, room;
    private int zipcode;

    public Address (String country, String city, String street, String building, int zipcode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipcode = zipcode;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", id='" + id + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}

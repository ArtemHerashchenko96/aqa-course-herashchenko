package com.course.oop;

public class Manager extends User {
    private String position, responsibilityDistrict, workPhoneNumber;

    public Manager(String fullName, String email, String roleType, String position) {
        super(fullName, email, roleType);
        this.position = position;
    }

    public Manager(String firstName, String lastName, String email, String roleType, String position) {
        super(firstName, lastName, email, roleType);
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String toString() {
        return
                "Manager{" +
                        "firstName='" + getFirstName() + '\'' +
                        ", lastName='" + getLastName() + '\'' +
                        ", fullName='" + getFullName() + '\'' +
                        ", email='" + getEmail() + '\'' +
                        ", billingAddress='" + getBillingAddress() + '\'' +
                        ", deliveryAddress='" + getDeliveryAddress() + '\'' +
                        ", role='" + getRole() + '\'' +
                        ", phoneNumber=" + getPhoneNumber() + '\'' +
                        ", position='" + position + '\'' +
                        ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                        ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }

    @Override
    public void printUserInfo() {
        System.out.println(toString());
    }
}


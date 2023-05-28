package com.course.additionalSyntax.Step3;

public class Manager extends User implements PrintInfo {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String fullName, String email, Role role, String position) {
        super(fullName, email, role);
        this.position = position;
    }
    public Manager(String firstName, String lastName, String email, Role role, String position) {
        super(firstName, lastName, email, role);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
        return super.toString() + "Manager{" +
                "position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}

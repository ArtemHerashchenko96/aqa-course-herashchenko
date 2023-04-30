package com.course.oop;

public class Cards {
    private String cardType, expireDate;
    private int id, cvv;
    private  long number;
    private static int nextId = 1;

    public  Cards (String cardType, long number, String expireDate, int cvv){
        this.cardType = cardType;
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getCardType() {
        return cardType;
    }

    public long getNumber() {
        return number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "id='" + id + '\'' +
                ", cardType='" + cardType + '\'' +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                ", number=" + number +
                '}';
    }
    public void printCardInfo() {
        System.out.println(toString());
    }
}

package com.course.additionalSyntax.Step3;

public class Card {
    private static int id;
    private String number;
    private String expireDate;
    private int cvv;
    private CardType cardType;

    public Card(String number, String expireDate, int cvv, CardType cardType) {
        id++;
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.cardType = cardType;
    }

    public static int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv=" + cvv +
                ", cardType=" + cardType +
                '}';
    }
    enum CardType {
        VISA,
        MASTERCARD
    }
}

package com.course.additionalSyntax.Step3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Artem", "Test", "artem@gmail.com", Role.MAIN_CUSTOMER);
        User user2 = new User("Kate", "Test", "kate@gmail.com", Role.ADMIN);

        Manager manager1 = new Manager("test", "test@test.com", Role.ADMIN, "qa");
        manager1.printInfo();

        Card card1 = new Card("34234234", "01/23", 234, Card.CardType.VISA);
        Card card2 = new Card("888888", "10/24", 785, Card.CardType.MASTERCARD);
        user1.printInfo();

        Broker broker1 = new Broker("Test", "test@gmail.com", "+243434343434");
        broker1.addClient(user1);
        broker1.addClient(user2);
        broker1.printInfo();

        ArrayList<Card>cardList1 = new ArrayList<>();
        cardList1.add(card1);
        cardList1.add(card2);
        user1.setCards(cardList1);
        user1.printAllCardNumbers();



    }
}
package org.example.Client_Project;

public class Main {
    public static void main(String[] args) {
        Clients clients = new Clients();
        clients.createNewClient("Jan", "Nowak");
        clients.createNewClient("Adamiak", "Adam");
        clients.createNewClient("Darecki", "Dariusz");

        System.out.println(" --- --- --- ");
        System.out.println(clients.activatePremiumAccount("1"));
        System.out.println(clients.getClientFullName("0"));
        System.out.println(" --- --- --- ");
        System.out.println(clients.getClientCreationDate("1"));
        System.out.println(clients.getClientCreationDate("2"));
        System.out.println(" --- --- --- ");
        System.out.println(clients.isPremiumClient("1"));
        System.out.println(clients.isPremiumClient("2"));
        System.out.println(" --- --- --- ");
        System.out.println(clients.getNumberOfClients());
        System.out.println(clients.getNumberOfPremiumClients());
    }
}
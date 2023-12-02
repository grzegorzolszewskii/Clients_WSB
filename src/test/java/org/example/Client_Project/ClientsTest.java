package org.example.Client_Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientsTest {

    private Clients ClientsUnderTests = new Clients();

    @Test
    void testClientsCreation(){
        ClientsUnderTests.createNewClient("Jan", "Nowak");
        ClientsUnderTests.createNewClient("Adamiak", "Adam");
        ClientsUnderTests.createNewClient("Darecki", "Dariusz");

        int numberOfAllClients = ClientsUnderTests.getNumberOfClients();

        Assertions.assertEquals(numberOfAllClients, 3);
    }

    @Test
    void testPremiumClients(){
        ClientsUnderTests.createNewClient("Jan", "Nowak");
        ClientsUnderTests.createNewClient("Adamiak", "Adam");
        ClientsUnderTests.activatePremiumAccount("1");

        boolean isId0Premium = ClientsUnderTests.isPremiumClient("0");
        boolean isID1Premium = ClientsUnderTests.isPremiumClient("1");
        int numberOfPremiumClients = ClientsUnderTests.getNumberOfPremiumClients();

        Assertions.assertFalse(isId0Premium);
        Assertions.assertTrue(isID1Premium);
        Assertions.assertEquals(numberOfPremiumClients, 1);
    }
}

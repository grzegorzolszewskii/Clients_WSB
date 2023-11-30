package org.example.Client_Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientsTest {

    private Clients ClientsUnderTests = new Clients();

    @Test
    void testClientsMethods(){
        // given
        ClientsUnderTests.createNewClient("Jan", "Nowak");
        ClientsUnderTests.createNewClient("Adamiak", "Adam");
        ClientsUnderTests.createNewClient("Darecki", "Dariusz");
        ClientsUnderTests.activatePremiumAccount("1");

        // when
        boolean isId0Premium = ClientsUnderTests.isPremiumClient("0");
        boolean isID1Premium = ClientsUnderTests.isPremiumClient("1");
        int numberOfAllClients = ClientsUnderTests.getNumberOfClients();
        int numberOfPremiumClients = ClientsUnderTests.getNumberOfPremiumClients();

        // then
        Assertions.assertFalse(isId0Premium);
        Assertions.assertTrue(isID1Premium);
        Assertions.assertEquals(numberOfAllClients, 3);
        Assertions.assertEquals(numberOfPremiumClients, 1);
    }


}
package org.example.Client_Project;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

public class Clients {
    public Map<String, Client> clientsDict = new HashMap<>();

    public String createNewClient(String firstName, String lastName) {
        Client newClient = new Client(firstName, lastName);
        clientsDict.put(newClient.getClientId(), newClient);
        return newClient.getClientId();
    }

    public String activatePremiumAccount(String clientId) {
        Client client = clientsDict.get(clientId);
        client.activatePremium();
        return clientId;
    }

    public String getClientFullName(String clientId) {
        Client client = clientsDict.get(clientId);
        return client.getClientFirstName() + " " + client.getClientLastName();
    }

    public LocalDateTime getClientCreationDate(String clientId) {
        Client client = clientsDict.get(clientId);
        return client.getCreationDate();
    }

    public boolean isPremiumClient(String clientId) {
        Client client = clientsDict.get(clientId);
        return client.isClientPremium();
    }

    public int getNumberOfClients() {
        return clientsDict.size();
    }

    public int getNumberOfPremiumClients() {
        int count = 0;
        for (Client client : clientsDict.values()) {
            if (client.isClientPremium()) {
                count++;
            }
        }
        return count;
    }

    public void getMap() {
        System.out.println(this.clientsDict);
    }
}
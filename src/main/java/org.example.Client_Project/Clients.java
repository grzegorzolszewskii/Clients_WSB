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
        client.isPremium = true;
        return clientId;
    }

    public String getClientFullName(String clientId) {
        Client client = clientsDict.get(clientId);
        return client.firstName + " " + client.lastName;
    }

    public LocalDateTime getClientCreationDate(String clientId) {
        Client client = clientsDict.get(clientId);
        return client.creationDate;
    }

    public boolean isPremiumClient(String clientId) {
        Client client = clientsDict.get(clientId);
        return client.isPremium;
    }

    public int getNumberOfClients() {
        return clientsDict.size();
    }

    public int getNumberOfPremiumClients() {
        int count = 0;
        for (Client client : clientsDict.values()) {
            if (client.isPremium) {
                count++;
            }
        }
        return count;
    }

    public void getMap() {
        System.out.println(this.clientsDict);
    }
}
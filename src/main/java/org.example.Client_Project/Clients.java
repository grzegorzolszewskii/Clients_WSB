package org.example.Client_Project;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

import static java.lang.String.valueOf;

public class Clients {
    public Map<String, Client> clientsDict = new HashMap<>();
    private static int ids = 0;

    public String createNewClient(String firstName, String lastName) {
        Client newClient = new Client(firstName, lastName);
        String id_str = valueOf(ids);
        clientsDict.put(id_str, newClient);
        ids++;
        return id_str;
    }

    public String activatePremiumAccount(String clientId) {
        if (clientsDict.containsKey(clientId)) {
            Client client = clientsDict.get(clientId);
            client.activatePremium();
            return clientId;
        }
        else {
            throw new ClientNotFoundException("Client with this ID cannot be found.");
        }
    }

    public String getClientFullName(String clientId) {
        if (clientsDict.containsKey(clientId)) {
            Client client = clientsDict.get(clientId);
            return client.getClientFirstName() + " " + client.getClientLastName();
        } else {
            throw new ClientNotFoundException("Client with this ID cannot be found.");

        }
    }

    public LocalDateTime getClientCreationDate(String clientId) {
        if (clientsDict.containsKey(clientId)) {
            Client client = clientsDict.get(clientId);
            return client.getCreationDate();
        } else {
            throw new ClientNotFoundException("Client with this ID cannot be found.");
        }
    }

    public boolean isPremiumClient(String clientId) {
        if (clientsDict.containsKey(clientId)) {
            Client client = clientsDict.get(clientId);
            return client.isClientPremium();
        } else {
            throw new ClientNotFoundException("Client with this ID cannot be found.");
        }
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
package org.example.Client_Project;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

import static java.lang.String.valueOf;

public class Clients {
    public Map<String, Client> clientsDict = new HashMap<>();
    private static int ids = 0;

    private Client getClientById(String clientId){
        if (!clientsDict.containsKey(clientId)){
            throw new ClientNotFoundException("Client with this ID cannot be found.");
        }
        return clientsDict.get(clientId);
    }

    public String createNewClient(String firstName, String lastName) {
        Client newClient = new Client(firstName, lastName);
        String id_str = valueOf(ids);
        clientsDict.put(id_str, newClient);
        ids++;
        return id_str;
    }

    public String activatePremiumAccount(String clientId) {
        Client client = getClientById(clientId);
        client.activatePremium();
        return clientId;
    }

    public String getClientFullName(String clientId) {
        Client client = getClientById(clientId);
        return client.getClientFirstName() + " " + client.getClientLastName();
    }

    public LocalDateTime getClientCreationDate(String clientId) {
        Client client = getClientById(clientId);
        return client.getCreationDate();
    }

    public boolean isPremiumClient(String clientId) {
        Client client = getClientById(clientId);
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
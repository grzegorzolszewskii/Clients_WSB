package org.example.Client_Project;

import java.time.LocalDateTime;

public class Client {
    private static int code = 0;
    public String firstName;
    public String lastName;
    public boolean isPremium;
    public LocalDateTime creationDate;
    public String clientId;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremium = false;
        this.creationDate = LocalDateTime.now();
        this.clientId = String.valueOf(code);
        code++;
    }

    public String getClientId() {
        return clientId;
    }
}
package org.example.Client_Project;

import java.time.LocalDateTime;

public class Client {
    private static int code = 0;
    private String firstName;
    private String lastName;
    private boolean isPremium;
    private LocalDateTime creationDate;
    private String clientId;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremium = false;
        this.creationDate = LocalDateTime.now();
        this.clientId = String.valueOf(code);
        code++;
    }

    public String getClientFirstName(){return this.firstName;}
    public String getClientLastName(){return this.lastName;}
    public LocalDateTime getCreationDate(){return this.creationDate;}
    public boolean isClientPremium(){return this.isPremium;}
    public String getClientId(){return this.clientId;}

    public void activatePremium(){this.isPremium = true;}
    public void deactivatePremium(){this.isPremium = false;}

}
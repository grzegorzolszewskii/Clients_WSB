package org.example.Client_Project;

import java.time.LocalDateTime;

public class Client {
    private String firstName;
    private String lastName;
    private boolean isPremium;
    private LocalDateTime creationDate;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremium = false;
        this.creationDate = LocalDateTime.now();
    }

    public String getClientFirstName(){return this.firstName;}
    public String getClientLastName(){return this.lastName;}
    public LocalDateTime getCreationDate(){return this.creationDate;}
    public boolean isClientPremium(){return this.isPremium;}

    public void activatePremium(){this.isPremium = true;}
    public void deactivatePremium(){this.isPremium = false;}

}
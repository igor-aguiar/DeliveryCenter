package com.example.DeliveryCenter.dto;

import com.example.DeliveryCenter.model.Client;

import java.time.LocalDate;

public class ClientDTO {
    private String clientName;
    private String clientBirthdate;
    private String clientEmail;
    private String clientPassword;

    public ClientDTO() {
    }

    public ClientDTO(String clientName, String clientBirthdate, String clientEmail, String clientPassword) {
        this.clientName = clientName;
        this.clientBirthdate = clientBirthdate;
        this.clientEmail = clientEmail;
        this.clientPassword = clientPassword;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientBirthdate() {
        return clientBirthdate;
    }

    public void setClientBirthdate(String clientBirthdate) {
        this.clientBirthdate = clientBirthdate;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public Client toClient(){
        return new Client(this.clientName, LocalDate.parse(this.clientBirthdate), this.clientEmail, this.clientPassword);
    }
}

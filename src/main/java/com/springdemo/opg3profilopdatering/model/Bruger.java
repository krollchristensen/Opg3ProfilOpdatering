package com.springdemo.opg3profilopdatering.model;

public class Bruger {
    private String navn;
    private String email;

    // Constructors, getters og setters...

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bruger(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public Bruger() {
    }
}

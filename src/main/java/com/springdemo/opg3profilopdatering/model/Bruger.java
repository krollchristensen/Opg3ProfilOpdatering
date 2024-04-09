package com.springdemo.opg3profilopdatering.model;

/**
 * Repræsenterer en bruger med navn og e-mail felter.
 */
public class Bruger {
    private String navn; // Brugerens navn
    private String email; // Brugerens e-mail

    // Konstruktører, getters og setters

    /**
     * Henter brugerens navn.
     * @return Brugerens navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sætter brugerens navn.
     * @param navn Det nye navn på brugeren
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    /**
     * Henter brugerens e-mail.
     * @return Brugerens e-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sætter brugerens e-mail.
     * @param email Den nye e-mail på brugeren
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Konstruktør til oprettelse af en bruger med navn og e-mail.
     * @param navn Brugerens navn
     * @param email Brugerens e-mail
     */
    public Bruger(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    /**
     * Standardkonstruktør.
     */
    public Bruger() {
    }
}

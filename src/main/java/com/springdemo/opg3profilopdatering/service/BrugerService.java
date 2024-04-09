package com.springdemo.opg3profilopdatering.service;
import com.springdemo.opg3profilopdatering.model.Bruger;
import org.springframework.stereotype.Service;

/**
 * Service til håndtering af brugerdata.
 * Simulerer en simpel databaseinteraktion med en enkelt bruger.
 */
@Service
public class BrugerService {
    private Bruger bruger = new Bruger(); // Simuleret databasepost for en bruger

    /**
     * Henter den nuværende bruger.
     * @return Den enkelte instans af Bruger
     */
    public Bruger hentBruger() {
        return bruger;
    }

    /**
     * Opdaterer brugeren med nye data.
     * @param opdateretBruger Brugerobjektet med opdateret information
     */
    public void opdaterBruger(Bruger opdateretBruger) {
        bruger.setNavn(opdateretBruger.getNavn());
        bruger.setEmail(opdateretBruger.getEmail());
    }
}

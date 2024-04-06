package com.springdemo.opg3profilopdatering.service;
import com.springdemo.opg3profilopdatering.model.*;

import org.springframework.stereotype.Service;

@Service
public class BrugerService {
    private Bruger bruger = new Bruger(); // Simulerer en "database" med en enkelt bruger

    public Bruger hentBruger() {
        return bruger;
    }

    public void opdaterBruger(Bruger opdateretBruger) {
        bruger.setNavn(opdateretBruger.getNavn());
        bruger.setEmail(opdateretBruger.getEmail());
    }
}

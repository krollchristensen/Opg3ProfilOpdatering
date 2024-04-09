package com.springdemo.opg3profilopdatering.controller;

import com.springdemo.opg3profilopdatering.model.Bruger;
import com.springdemo.opg3profilopdatering.service.BrugerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller til håndtering af brugerprofiler i en Spring Boot-applikation.
 * Mapper anmodninger relateret til bruger ('Bruger') operationer.
 */
@Controller
@RequestMapping("/bruger") // Basissti for alle metoder i denne controller
//http://localhost:8080/bruger/rediger
public class BrugerController {

    @Autowired
    private BrugerService brugerService; // Indsætter BrugerService til interaktion med brugerdata

    /**
     * Viser formularen til redigering af brugerprofilen.
     * @param model Model til at sende data til visningsskabelonen
     * @return Navnet på Thymeleaf-skabelonen, der skal gengives
     */
    @GetMapping("/rediger")
    public String redigerBrugerForm(Model model) {
        Bruger bruger = brugerService.hentBruger(); // Henter den nuværende bruger
        model.addAttribute("bruger", bruger); // Tilføjer brugeren til modellen for visningen
        return "rediger_bruger"; // Returnerer navnet på Thymeleaf-skabelonen til redigering af brugeren
    }

    /**
     * Behandler indsendelsen af formularen til opdatering af brugerprofilen.
     * @param bruger Brugerobjekt udfyldt med data fra den indsendte formular
     * @return Omdirigerer til brugerprofilens side
     */
    @PostMapping("/opdater")
    public String opdaterBruger(Bruger bruger) {
        brugerService.opdaterBruger(bruger); // Opdaterer brugeren med de nye data
        return "redirect:/bruger/profil"; // Omdirigerer til profilside, undgår dobbeltindsendelser
    }

    /**
     * Viser brugerprofilens side.
     * @param model Model til at sende data til visningsskabelonen
     * @return Navnet på Thymeleaf-skabelonen, der skal gengives
     */
    @GetMapping("/profil")
    public String visProfil(Model model) {
        Bruger bruger = brugerService.hentBruger(); // Henter den nuværende bruger
        model.addAttribute("bruger", bruger); // Tilføjer brugeren til modellen for visningen
        return "profil"; // Returnerer navnet på Thymeleaf-skabelonen til visning af brugerprofilen
    }
}

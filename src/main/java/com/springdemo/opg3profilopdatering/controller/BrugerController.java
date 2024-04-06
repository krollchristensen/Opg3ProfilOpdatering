package com.springdemo.opg3profilopdatering.controller;
import com.springdemo.opg3profilopdatering.model.Bruger;
import com.springdemo.opg3profilopdatering.service.BrugerService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bruger")
public class BrugerController {

    @Autowired
    private BrugerService brugerService;
//http://localhost:8080/bruger/rediger
    @GetMapping("/rediger")
    public String redigerBrugerForm(Model model) {
        Bruger bruger = brugerService.hentBruger(); // Antager der kun er én bruger
        model.addAttribute("bruger", bruger);
        return "rediger_bruger";
    }

    @PostMapping("/opdater")
    public String opdaterBruger(Bruger bruger) {
        brugerService.opdaterBruger(bruger);
        return "redirect:/bruger/profil";
    }

    @GetMapping("/profil")
    public String visProfil(Model model) {
        Bruger bruger = brugerService.hentBruger(); // Antager der kun er én bruger
        model.addAttribute("bruger", bruger);
        return "profil";
    }
}

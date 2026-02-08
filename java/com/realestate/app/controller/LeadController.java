package com.realestate.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.realestate.app.entity.Lead;
import com.realestate.app.repository.LeadRepository;

@Controller
public class LeadController {

    public LeadController() {
        System.out.println("✅ LeadController LOADED");
    }

    @Autowired
    private LeadRepository leadRepository;

    @PostMapping("/submit-lead")
    public String submitLead(
            @RequestParam String project,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String message) {

        System.out.println("✅ FORM SUBMITTED");

        Lead lead = new Lead();
        lead.setProject(project);
        lead.setName(name);
        lead.setEmail(email);
        lead.setPhone(phone);
        lead.setMessage(message);

        leadRepository.save(lead);

        return "redirect:/thank.html";
    }
}

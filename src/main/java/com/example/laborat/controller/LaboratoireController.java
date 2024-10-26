package com.example.laborat.controller;

import com.example.laborat.Entite.Laboratoire;
import com.example.laborat.repository.LaboratoireRepository;
import com.example.laborat.service.LaboratoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/laboratoires")
public class LaboratoireController {

    @Autowired
    private LaboratoireService laboratoireService;

    @PostMapping
    public Laboratoire addLabotatoire(@RequestBody Laboratoire laboratoire)
    {
        return laboratoireService.save(laboratoire);
    }

    @GetMapping
    public List<Laboratoire> listLaboratoires()
    {
        return laboratoireService.findAll();
    }
}

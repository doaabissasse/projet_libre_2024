package com.example.laborat.service;

import com.example.laborat.Entite.Laboratoire;
import com.example.laborat.repository.LaboratoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratoireService {

    @Autowired
    private LaboratoireRepository laboratoireRepository;

    public LaboratoireService() {
    }

    public LaboratoireService(LaboratoireRepository laboratoireRepository) {
        this.laboratoireRepository = laboratoireRepository;
    }

    public Laboratoire save(Laboratoire laboratoire)
    {
        return laboratoireRepository.save(laboratoire);
    }

    public List<Laboratoire> findAll()
    {
        return laboratoireRepository.findAll();
    }
}


package com.SotnanceL3.SotnanceL3Api.service;



import com.SotnanceL3.SotnanceL3Api.entity.Rapport;
import com.SotnanceL3.SotnanceL3Api.repository.RapportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RapportService
{
    private  final RapportRepository rapportRepository;
    @Autowired
    public RapportService(RapportRepository rapportRepository) {
        this.rapportRepository = rapportRepository;
    }


    public List<Rapport> getRapports()
    {
        return rapportRepository.findAll();
    }
public Optional<Rapport> geRapport(Long id){return rapportRepository.findById(id);}
    @SuppressWarnings("null")

    public void addRapport (Rapport rapport)
    {
        rapportRepository.save(rapport);
    }



    @SuppressWarnings("null")

    public void deletRapport(Long id)
    {
        rapportRepository.deleteById(id);
    }

    public void updateRapport(Long id, Rapport updatedRapport) {

        @SuppressWarnings("null")
        Optional<Rapport> optionalRapport =  rapportRepository.findById(id);
        if (optionalRapport.isPresent()) {
            Rapport existingRapport = optionalRapport.get();

            existingRapport.setRapport(updatedRapport.getRapport());;
            existingRapport.setId(updatedRapport.getId());

            rapportRepository.save(existingRapport);
        } else {
            throw new IllegalArgumentException("Facture with ID " + id + " not found");
        }
    }
}



package com.SotnanceL3.SotnanceL3Api.service;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.entity.Facture;
import com.SotnanceL3.SotnanceL3Api.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FactureService {

@SuppressWarnings("unused")
private final FactureRepository factureRepository;
@Autowired
public FactureService(FactureRepository factureRepository) {
    this.factureRepository = factureRepository;
}

 public List<Facture> getFacture()
 {
    return factureRepository.findAll();
 }

@SuppressWarnings("null")

public void addFacture (Facture facture)
{
factureRepository.save(facture);
}



@SuppressWarnings("null")

public void deletFacture(Long idFacture)
{
factureRepository.deleteById(idFacture);
}

    public void updateFacture(Long id, Facture updatedFacture) {
    
        @SuppressWarnings("null")
        Optional<Facture> optionalFacture = factureRepository.findById(id);
        if (optionalFacture.isPresent()) {
            Facture existingFacture = optionalFacture.get();
            
         existingFacture.setFacture(updatedFacture.getFacture());;
            existingFacture.setIdFacture(updatedFacture.getIdFacture());

           factureRepository.save(existingFacture);
        } else {
            throw new IllegalArgumentException("Facture with ID " + id + " not found");
        }
    }
}
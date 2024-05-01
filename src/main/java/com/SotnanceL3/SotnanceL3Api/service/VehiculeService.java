package com.SotnanceL3.SotnanceL3Api.service;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.entity.Vehicule;
import com.SotnanceL3.SotnanceL3Api.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VehiculeService {


@SuppressWarnings("unused")

private final VehiculeRepository VRepository;
@Autowired
public VehiculeService(VehiculeRepository vRepository) {
    VRepository = vRepository;
}

   public List<Vehicule> getV() {
        return VRepository.findAll();
    }

    @SuppressWarnings("null")
    public void addV(Vehicule v) {
        VRepository.save(v);
    }

    @SuppressWarnings("null")
    public void deleteV(Long idV) {
        VRepository.deleteById(idV);
    }

    public void updateV(Long id, Vehicule V) {
        @SuppressWarnings("null")
        Optional<Vehicule> optionalV= VRepository.findById(id);
        if (optionalV.isPresent()) {
            Vehicule existingV = optionalV.get();
            
           existingV.setIdVehicule(V.getIdVehicule());
existingV.setVehiculeMatriquelle(V.getVehiculeMatriquelle());
           

VRepository.save(existingV);
        } else {
            throw new IllegalArgumentException("Vehicule with ID " + id + " not found");
        }
    }

  
    
}

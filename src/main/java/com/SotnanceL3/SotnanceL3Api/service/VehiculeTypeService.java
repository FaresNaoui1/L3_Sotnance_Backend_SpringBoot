package com.SotnanceL3.SotnanceL3Api.service;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.entity.VehiculeType;
import com.SotnanceL3.SotnanceL3Api.repository.VehiculeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeTypeService {
@SuppressWarnings("unused")
private VehiculeTypeRepository vTypeRepository;
@Autowired
public VehiculeTypeService(VehiculeTypeRepository vTypeRepository) {
    this.vTypeRepository = vTypeRepository;
}
   public List<VehiculeType> getVT() {
        return vTypeRepository.findAll();
    }

    @SuppressWarnings("null")
    public void addVT(VehiculeType vt) {
        vTypeRepository.save(vt);
    }

    @SuppressWarnings("null")
    public void deleteVT(Long idVT) {
        vTypeRepository.deleteById(idVT);
    }

    public void updateVT(Long id, VehiculeType VT) {
        @SuppressWarnings("null")
        Optional<VehiculeType> optionalVT = vTypeRepository.findById(id);
        if (optionalVT.isPresent()) {
            VehiculeType existingVT = optionalVT.get();
            
           existingVT.setIdVType(VT.getIdVType());
existingVT.setVehiculetype(VT.getVehiculetype());
           

vTypeRepository.save(existingVT);
        } else {
            throw new IllegalArgumentException("VT with ID " + id + " not found");
        }
    }
}

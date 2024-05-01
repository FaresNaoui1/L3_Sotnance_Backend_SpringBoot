package com.SotnanceL3.SotnanceL3Api.service;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.entity.VehiculeMarque;
import com.SotnanceL3.SotnanceL3Api.repository.VehiculeMarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeMarqueService {


@SuppressWarnings("unused")

private final VehiculeMarqueRepository vmRepository;
@Autowired
public VehiculeMarqueService(VehiculeMarqueRepository vmRepository) {
    this.vmRepository = vmRepository;
}





   public List<VehiculeMarque> getVM() {
        return vmRepository.findAll();
    }

    @SuppressWarnings("null")
    public void addVM(VehiculeMarque vm) {
        vmRepository.save(vm);
    }

    @SuppressWarnings("null")
    public void deleteVM(Long idVM) {
        vmRepository.deleteById(idVM);
    }

    public void updateVT(Long id, VehiculeMarque VM) {
        @SuppressWarnings("null")
        Optional<VehiculeMarque> optionalVM = vmRepository.findById(id);
        if (optionalVM.isPresent()) {
            VehiculeMarque existingVM = optionalVM.get();
            
           existingVM.setIdVM(VM.getIdVM());
existingVM.setVehiculemarque(VM.getVehiculemarque());
           

vmRepository.save(existingVM);
        } else {
            throw new IllegalArgumentException("VT with ID " + id + " not found");
        }
    }
}

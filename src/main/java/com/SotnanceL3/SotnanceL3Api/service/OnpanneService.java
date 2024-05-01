package com.SotnanceL3.SotnanceL3Api.service;

import java.util.List;
import java.util.Optional;

import com.SotnanceL3.SotnanceL3Api.entity.Onpanne;
import com.SotnanceL3.SotnanceL3Api.repository.OnpanneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnpanneService {
@SuppressWarnings("unused")
private final OnpanneRepository onpanneRepository;
@Autowired
public OnpanneService(OnpanneRepository onpanneRepository) {
    this.onpanneRepository = onpanneRepository;
}

public List<Onpanne> getOnpanne()
 {
    return onpanneRepository.findAll();
 }

@SuppressWarnings("null")

public void addOnpanne (Onpanne onpanne)
{
onpanneRepository.save(onpanne);
}



@SuppressWarnings("null")

public void deletOnpanne(Long id)
{
onpanneRepository.deleteById(id);
}

    public void updateOnpanne(Long id, Onpanne updateOnpanne) {
    
        @SuppressWarnings("null")
        Optional<Onpanne> optionalOnpanne = onpanneRepository.findById(id);
        if (optionalOnpanne.isPresent()) {
            Onpanne existingOnpanne = optionalOnpanne.get();
existingOnpanne.setIdPanne(updateOnpanne.getIdPanne());
existingOnpanne.setOnpanne(updateOnpanne.getOnpanne());

onpanneRepository.save(existingOnpanne);
        } else {
            throw new IllegalArgumentException("Panne with ID " + id + " not found");
        }
    }

}

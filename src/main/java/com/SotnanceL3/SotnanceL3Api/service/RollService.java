package com.SotnanceL3.SotnanceL3Api.service;

import com.SotnanceL3.SotnanceL3Api.entity.Roll;
import com.SotnanceL3.SotnanceL3Api.repository.RollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RollService {

    private final RollRepository rollRepository;

    @Autowired
    public RollService(RollRepository rollRepository) {
        this.rollRepository = rollRepository;
    }

    public List<Roll> getRoll() {
        return rollRepository.findAll();
    }

    @SuppressWarnings("null")
    public void addRoll(Roll roll) {
        rollRepository.save(roll);
    }

    @SuppressWarnings("null")
    public void deleteRoll(Long idRoll) {
        rollRepository.deleteById(idRoll);
    }

    public void updateRoll(Long id, Roll updatedRoll) {
        @SuppressWarnings("null")
        Optional<Roll> optionalRoll = rollRepository.findById(id);
        if (optionalRoll.isPresent()) {
            Roll existingRoll = optionalRoll.get();
            
           existingRoll.setId(updatedRoll.getId());
            existingRoll.setType(updatedRoll.getType());
            

            rollRepository.save(existingRoll);
        } else {
            throw new IllegalArgumentException("Roll with ID " + id + " not found");
        }
        
    }

    public Optional<Roll> getRollById(Long id)
    {
return rollRepository.findById(id);
    }
}

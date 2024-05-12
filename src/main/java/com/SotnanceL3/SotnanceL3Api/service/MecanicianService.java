package com.SotnanceL3.SotnanceL3Api.service;

import com.SotnanceL3.SotnanceL3Api.entity.Mecanician;
import com.SotnanceL3.SotnanceL3Api.entity.Person;
import com.SotnanceL3.SotnanceL3Api.repository.MacanicianRepository;
import com.SotnanceL3.SotnanceL3Api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MecanicianService {

    private final MacanicianRepository macanicianRepository;
@Autowired
    public MecanicianService(MacanicianRepository macanicianRepository) {
        this.macanicianRepository = macanicianRepository;
    }


    public List<Mecanician> getMecanicians() {
        return macanicianRepository.findAll();
    }
    public Optional<Mecanician> getMecanician(Long id){return  macanicianRepository.findById(id);}
 @SuppressWarnings("null")
public Mecanician AddMecanician(Mecanician person)
 {
	return macanicianRepository.save(person);
 }

@SuppressWarnings("null")
public void DeletMecanician(Long idPerson) {
    macanicianRepository.deleteById(idPerson);
}


@SuppressWarnings("null")
public void UpdateMecanician(Long id, Mecanician updatedPerson) {
    Optional<Mecanician> optionalPerson = macanicianRepository.findById(id);
    if (optionalPerson.isPresent()) {
        Mecanician existingPerson = optionalPerson.get();
        existingPerson.setFirstName(updatedPerson.getFirstName());
        existingPerson.setName(updatedPerson.getName());
        existingPerson.setBirthdate(updatedPerson.getBirthdate());
        existingPerson.setSellPhone(updatedPerson.getSellPhone());
        macanicianRepository.save(existingPerson);
    } else {
        // Handle error: Person not found
        throw new IllegalArgumentException("Person with ID " + id + " not found");
    }
}




}


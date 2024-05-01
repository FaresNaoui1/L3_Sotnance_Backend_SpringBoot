package com.SotnanceL3.SotnanceL3Api.service;



import com.SotnanceL3.SotnanceL3Api.entity.Location;
import com.SotnanceL3.SotnanceL3Api.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
@SuppressWarnings("unused")
private final LocationRepository locationRepository;
@Autowired
public LocationService(LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
}

public List<Location> getLocation()
 {
    return locationRepository.findAll();
 }

@SuppressWarnings("null")

public void addLocation (Location location)
{
locationRepository.save(location);
}



@SuppressWarnings("null")

public void deletLocation(Long idLocation)
{
locationRepository.deleteById(idLocation);
}

    public void updateRoll(Long id, Location updatedLocation) {
    
        @SuppressWarnings("null")
        Optional<Location> optionalLocation = locationRepository.findById(id);
        if (optionalLocation.isPresent()) {
            Location existingLocation = optionalLocation.get();
            
         existingLocation.setIdLocation(updatedLocation.getIdLocation());
existingLocation.setLocation(updatedLocation.getLocation());
           locationRepository.save(existingLocation);
        } else {
            throw new IllegalArgumentException("Location with ID " + id + " not found");
        }
    }





}

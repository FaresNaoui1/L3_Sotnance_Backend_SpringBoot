package com.SotnanceL3.SotnanceL3Api.controller;

import java.util.List;


import com.SotnanceL3.SotnanceL3Api.entity.Location;

import com.SotnanceL3.SotnanceL3Api.service.LocationService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/location")
public class LocationController {
@SuppressWarnings("unused")
private final LocationService locationService;

public LocationController(LocationService locationService) {
    this.locationService = locationService;
}


@GetMapping
public List<Location> GetLocation()
{
    return locationService.getLocation();
}

@PostMapping
public void addLocation(@RequestBody Location location)
{
    locationService.addLocation(location);
}

@DeleteMapping("/{idLocation}")
public void DeletFacture( @PathVariable("idLocation") Long ID)
{
    locationService.deletLocation(ID);
}

@PutMapping("/{idLocation}")
public void updatedFacture(@PathVariable("idLocation") Long Id , Location location)
{
    locationService.updateRoll(Id, location);
}
}

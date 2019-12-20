package com.abhave.location.controllers;

import com.abhave.location.entities.Location;
import com.abhave.location.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }
    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id) {
        locationRepository.deleteById(id);
    }

    @GetMapping("{id}")
    public Location getLocation(@PathVariable("id") int id) {
        Optional<Location> optionalLocation = locationRepository.findById(id);
        return optionalLocation.get();

    }
}

package com.abhave.location.service;

import com.abhave.location.entities.Location;
import com.abhave.location.repositories.LocationRepository;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {



    @Autowired
    private LocationRepository locationRepo;

    @Override
    public Location saveLocation(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepo.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepo.deleteById(location.getId());
    }

    @Override
    public Location getLocationById(Integer Id) {
        Optional<Location> optionalLocation = locationRepo.findById(Id);
        return optionalLocation.get();
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepo.findAll();
    }


    public LocationRepository getLocationRepo() {
        return locationRepo;
    }

    public void setLocationRepo(LocationRepository locationRepo) {
        this.locationRepo = locationRepo;
    }
}

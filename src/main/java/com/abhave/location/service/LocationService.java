package com.abhave.location.service;

import com.abhave.location.entities.Location;
import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationById(Integer id);
    List<Location> getAllLocations();


}

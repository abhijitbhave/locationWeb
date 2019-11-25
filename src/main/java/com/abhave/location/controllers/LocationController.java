package com.abhave.location.controllers;

import com.abhave.location.entities.Location;
import com.abhave.location.service.LocationService;
import com.abhave.location.util.EmailUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @Autowired
    EmailUtil emailUtil;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLoc(@ModelAttribute("location")Location location, ModelMap modelMap) {
        Location savedLocation = service.saveLocation(location);
        String msg = "Location saved with id: "+savedLocation.getId();
        modelMap.addAttribute("msg", msg);
        emailUtil.sendEmail("bhaveprojects@gmail.com", "Location Saved", "We just saved a new location to the database.");
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        service.deleteLocation(service.getLocationById(id));
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

    @RequestMapping("/editLocation")
    public String showEdit(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = service.getLocationById(id);
        modelMap.addAttribute("location", location);
        return "editLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLoc(@ModelAttribute("location")Location location, ModelMap modelMap) {
        service.saveLocation(location);
        List<Location> locations = service.getAllLocations();
        String msg = "Location updated: ";
        modelMap.addAttribute("msg", msg);
        modelMap.addAttribute("locations", locations);
        emailUtil.sendEmail("bhaveprojects@gmail.com", "Location Updated", "We just updated a new location to the database.");
        return "displayLocations";
    }

}

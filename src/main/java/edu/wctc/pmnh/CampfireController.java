package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/campfires")
public class CampfireController {
    @RequestMapping("/tepee")
    public String showTepeeCampfire() {
        return "pages/tepee-fire";
    }

    @RequestMapping("/log-cabin")
    public String showLogCabinCampfire() {return "pages/log-cabin-fire";}

    @RequestMapping("/star")
    public String showStarCampfire() {
        return "pages/star-fire";
    }
}
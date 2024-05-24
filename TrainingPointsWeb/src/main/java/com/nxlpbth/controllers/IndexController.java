package com.nxlpbth.controllers;


import com.nxlpbth.services.ActivityService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@Controller
@ControllerAdvice
public class IndexController {
    @Autowired
    private ActivityService activityService;
    
//    @ModelAttribute
//    public void commonAttr(Model model) {
//        model.addAttribute("categories", this.activityService.getCates());
//    }
    
    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("activities", this.activityService.getActivities());
        return "index";
    }
}


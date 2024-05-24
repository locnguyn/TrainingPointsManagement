/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxlpbth.services.impl;

import com.nxlpbth.pojo.Activity;
import com.nxlpbth.repositories.ActivityRepository;
import com.nxlpbth.services.ActivityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityRepository activityRepo;

    @Override
    public List<Activity> getActivities() {
        return activityRepo.getActivities();
    }

    @Override
    public Activity getActivityById(int id) {
        return activityRepo.getActivityById(id);
    }
    
}

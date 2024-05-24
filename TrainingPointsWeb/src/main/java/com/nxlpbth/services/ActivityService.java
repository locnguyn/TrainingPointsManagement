package com.nxlpbth.services;

import com.nxlpbth.pojo.Activity;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public interface ActivityService {
    List<Activity> getActivities();
    Activity getActivityById(int id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxlpbth.repositories;

import com.nxlpbth.pojo.Activity;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface ActivityRepository {
    List<Activity> getActivities();
    Activity getActivityById(int id);
}

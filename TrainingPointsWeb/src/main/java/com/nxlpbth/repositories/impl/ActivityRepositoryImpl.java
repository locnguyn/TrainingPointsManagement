/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxlpbth.repositories.impl;

import com.nxlpbth.pojo.Activity;
import com.nxlpbth.repositories.ActivityRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DELL
 */
@Repository
@Transactional
public class ActivityRepositoryImpl implements ActivityRepository {
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Activity> getActivities() {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createNamedQuery("activity.findAll");
        System.out.println(q.getResultList());
        return q.getResultList();
    }

    @Override
    public Activity getActivityById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
        return s.get(Activity.class, id);
    }
    
}

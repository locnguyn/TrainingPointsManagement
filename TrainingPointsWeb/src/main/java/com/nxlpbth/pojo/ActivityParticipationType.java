/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nxlpbth.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "activity_participation_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActivityParticipationType.findAll", query = "SELECT a FROM ActivityParticipationType a"),
    @NamedQuery(name = "ActivityParticipationType.findById", query = "SELECT a FROM ActivityParticipationType a WHERE a.id = :id"),
    @NamedQuery(name = "ActivityParticipationType.findByPoint", query = "SELECT a FROM ActivityParticipationType a WHERE a.point = :point")})
public class ActivityParticipationType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "point")
    private int point;
    @JoinColumn(name = "acitivity_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Activity acitivityId;
    @JoinColumn(name = "participation_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ParticipationType participationTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activityParticipationTypeId")
    private Set<Registration> registrationSet;

    public ActivityParticipationType() {
    }

    public ActivityParticipationType(Integer id) {
        this.id = id;
    }

    public ActivityParticipationType(Integer id, int point) {
        this.id = id;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Activity getAcitivityId() {
        return acitivityId;
    }

    public void setAcitivityId(Activity acitivityId) {
        this.acitivityId = acitivityId;
    }

    public ParticipationType getParticipationTypeId() {
        return participationTypeId;
    }

    public void setParticipationTypeId(ParticipationType participationTypeId) {
        this.participationTypeId = participationTypeId;
    }

    @XmlTransient
    public Set<Registration> getRegistrationSet() {
        return registrationSet;
    }

    public void setRegistrationSet(Set<Registration> registrationSet) {
        this.registrationSet = registrationSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivityParticipationType)) {
            return false;
        }
        ActivityParticipationType other = (ActivityParticipationType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nxlpbth.pojo.ActivityParticipationType[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vladimir.methotels.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author Vladimir
 */
@Entity
@Table(name = "hotelroom")
public class Hotelroom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonVisual
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "floor")
    private String floor;
    @Column(name = "number")
    private String number;
    @Column(name = "roomSize")
    private String roomSize;
    @Column(name = "internet")
    private Boolean internet;
    @Column(name = "jacuzzi")
    private Boolean jacuzzi;
    @Column(name = "tv")
    private Boolean tv;

    @Inject
    public Hotelroom() {
    }

    public Hotelroom(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public Boolean getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(Boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
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
        if (!(object instanceof Hotelroom)) {
            return false;
        }
        Hotelroom other = (Hotelroom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vladimir.methotels.entities.Hotelroom[ id=" + id + " ]";
    }

}

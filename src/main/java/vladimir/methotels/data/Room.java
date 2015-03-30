/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vladimir
 */
package vladimir.methotels.data;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Room {

    private Long id;
    private String name;
    private String floor;
    private String number;
    private String size;
    private Boolean tv;
    private Boolean internet;
    private Boolean jacuzzi;

    @Inject
    public Room() {
    }

    @NonVisual
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
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

    
    
}

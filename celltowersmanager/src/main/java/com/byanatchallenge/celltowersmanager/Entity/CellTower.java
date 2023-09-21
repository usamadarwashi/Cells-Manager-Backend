package com.byanatchallenge.celltowersmanager.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

// To map the class into database we need @Entity
@Entity
// Serializable helps transform java class into different types of stream, (e.g: JSON)
public class CellTower implements Serializable {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long tower_id;
    private String operator;
    private String address;
    private Long height;
    private String tower_type;
    private Float latitude;
    private Float longitude;
    private String technology;

    // define a constructor
    public CellTower(){}
    public CellTower(Long tower_id, String operator, String address, Long height, String tower_type,
                     Float latitude, Float longitude, String technology) {
        this.tower_id = tower_id;
        this.operator = operator;
        this.address = address;
        this.height = height;
        this.tower_type = tower_type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.technology = technology;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getTower_id() {
        return tower_id;
    }
    public void setTower_id(Long tower_id){
        this.tower_id = tower_id;
    }

    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public Long getHeight() {
        return height;
    }
    public void setHeight(Long height){
        this.height = height;
    }

    public String getTower_type() {
        return tower_type;
    }
    public void setTower_type(String tower_type){
        this.tower_type = tower_type;
    }

    public Float getLatitude() {
        return latitude;
    }
    public void setLatitude(Float latitude){
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }
    public void setLongitude(Float longitude){
        this.longitude = longitude;
    }

    public String getTechnology() {
        return technology;
    }
    public void setTechnology(String technology){
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "CellTower{" +
                "id=" + id +
                ", tower_id='" + tower_id + '\'' +
                ", operator='" + operator + '\'' +
                ", address='" + address + '\'' +
                ", height='" + height + '\'' +
                ", tower_type='" + tower_type + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
}

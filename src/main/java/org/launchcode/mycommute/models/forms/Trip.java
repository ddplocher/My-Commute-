package org.launchcode.mycommute.models.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Trip {

    @Id
    @GeneratedValue
    private int id;

    @NotNull

    private String name;

    @NotNull

    private Double miles;

    @NotNull

    private Double cost;

    @NotNull

    private Double mpg;



    public Trip(String name, Double miles, Double cost, Double mpg){
        this.name = name;
        this.miles = miles;
        this.cost = cost;
        this.mpg = mpg;
    }

    public Trip(){

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getMiles(){
        return miles;
    }
    public void setMiles(Double miles){
        this.miles = miles;
    }
    public Double getCost(){
        return cost;
    }
    public void setCost(Double cost){
        this.cost = cost;
    }
    public Double getMpg(){
        return mpg;
    }
    public void setMpg(Double mpg){
        this.mpg = mpg;
    }
}


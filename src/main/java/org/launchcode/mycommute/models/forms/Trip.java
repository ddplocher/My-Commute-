package org.launchcode.mycommute.models.forms;

import org.hibernate.annotations.Formula;

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
    private Float miles;

    @NotNull
    private Float cost;

    @NotNull
    private Float mpg;

    @Formula("cost * (miles/mpg)")
    private Float total;



    public Trip(String name, Float miles, Float cost, Float mpg) {

        this.name = name;
        this.miles = miles;
        this.cost = cost;
        this.mpg = mpg;


    }
    public Trip(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Float getMiles(){
        return miles;
    }
    public void setMiles(Float miles){
        this.miles = miles;
    }
    public Float getCost(){
        return cost;
    }
    public void setCost(Float cost){
        this.cost = cost;
    }
    public Float getMpg(){
        return mpg;
    }
    public void setMpg(Float mpg){
        this.mpg = mpg;
    }
public Float getTotal(){return total;}
public void setTotal(float total) {
        this.total = total;
}

}




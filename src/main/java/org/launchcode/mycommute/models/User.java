package org.launchcode.mycommute.models;

import org.launchcode.mycommute.models.forms.Trip;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String password;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Trip> trips = new ArrayList<>();

    public User(String name, String password){
        this.name= name;
        this.password=password;
    }


    public User(){}

        public int getId() {return id;}

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public String getPassword() {return password;}

        public void setPassword(String password) {this.password = password;}

        public List<Trip> getTrips() {return trips;}

    }





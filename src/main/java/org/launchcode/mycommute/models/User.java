package org.launchcode.mycommute.models;

import org.launchcode.mycommute.models.forms.Trip;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @NotNull(message ="*Please provide a valid email")
    private String name;

    @NotNull
    @Size(min = 6, message= "*Your password must be at least 6 characters long")
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





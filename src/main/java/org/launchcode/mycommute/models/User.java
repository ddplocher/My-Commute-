package org.launchcode.mycommute.models;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.HashSet;


@Entity
@Table(name= "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private int id;

    @Column(name= "username")
    @NotEmpty
    private String username;

    @Column(name= "password")
    @NotEmpty(message ="*Please provide a valid email")
    private String password;




    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



    public User(){}

        public int getId() {return id;}

        public String getUsername() {return username;}

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {this.username= username;}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new HashSet<GrantedAuthority>();
    }

    public String getPassword() {return password;}

        public void setPassword(String password) {this.password = password;}



    }





package worldcupapp;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anthonybloomer
 */
public class User implements Serializable {

    private String username;
    private String email;
    private String team;
    private String subscription;
    private String pw;

    public User() {
        username = new String();
        email = new String();
        team = new String();
        subscription = new String();
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getSubscription() {
        return subscription;
    }

}

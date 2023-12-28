package com.epam.gymcrm.model;

import java.util.ArrayList;

public class Trainer {

    private Integer id;

    private String specialization;

    private User user;



    private ArrayList<Trainee> trainees;

    public Trainer() {
    }

    public Trainer(Integer id, String specialization, User user, ArrayList<Trainee> trainees) {
        this.id = id;
        this.specialization = specialization;
        this.user = user;
        this.trainees = trainees;
    }

    public Trainer(Integer id, String specialization) {
        this.id = id;
        this.specialization = specialization;
    }

    public Trainer(Integer id, String specialization, ArrayList<Trainee> trainees) {

        this.id = id;
        this.specialization = specialization;
        this.trainees = trainees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

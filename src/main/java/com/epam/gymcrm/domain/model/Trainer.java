package com.epam.gymcrm.domain.model;

import java.util.ArrayList;

public class Trainer {

    private Integer id;

    private String specialization;

    private Integer userId;

    private ArrayList<Trainee> trainees;

    public Trainer(Integer id, String specialization, Integer userId /*, ArrayList<Trainee> trainees */) {
        this.id = id;
        this.specialization = specialization;
        this.userId = userId;
        this.trainees = new ArrayList<>();
    }

    public Trainer(){

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

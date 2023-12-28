package com.epam.gymcrm.dto;

import com.epam.gymcrm.model.Trainee;

import java.util.ArrayList;

public class TrainerDto {

    private Integer id;

    private String specialization;

    private ArrayList<Trainee> trainees;

    public TrainerDto() {
    }

    public TrainerDto(Integer id, String specialization) {
        this.id = id;
        this.specialization = specialization;
    }

    public TrainerDto(Integer id, String specialization, ArrayList<Trainee> trainees) {

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
}

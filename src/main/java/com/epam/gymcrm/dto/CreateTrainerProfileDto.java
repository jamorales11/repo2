package com.epam.gymcrm.dto;

public class CreateTrainerProfileDto extends UserDto{

    private String specialization;

    public CreateTrainerProfileDto(Integer id, String firstName, String lastName, String username, String password, Boolean isActive, String specialization) {
        super(id, firstName, lastName, username, password, isActive);
        this.specialization = specialization;
    }
}

package com.epam.gymcrm.dto;

public class UserDto {


    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private Boolean isActive;

    public UserDto(Integer id, String firstName, String lastName, String username, String password, Boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }
}

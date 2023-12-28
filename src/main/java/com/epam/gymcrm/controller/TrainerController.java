package com.epam.gymcrm.controller;

import com.epam.gymcrm.dto.CreateTrainerProfileDto;
import com.epam.gymcrm.dto.TrainerDto;
import com.epam.gymcrm.facade.GymFacade;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", consumes = {"application/JSON"}, produces = {"application/JSON", "application/XML"})
public class TrainerController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private GymFacade gymFacade;

    @GetMapping("/createProfile")
    ResponseEntity<TrainerDto> create(@RequestBody CreateTrainerProfileDto createTrainerProfileDto) {
        //… your code return book;
        //gymFacade.createProfile(createTrainerProfileDto);
    }

}

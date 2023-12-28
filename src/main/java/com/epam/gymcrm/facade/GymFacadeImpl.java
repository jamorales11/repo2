package com.epam.gymcrm.facade;

import com.epam.gymcrm.dto.TrainerDto;
import com.epam.gymcrm.model.Trainer;
import com.epam.gymcrm.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class GymFacadeImpl implements GymFacade{

    private final TrainerService trainerService;

    @Autowired
    public GymFacadeImpl(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    public void createProfile(TrainerDto trainerDto){
        trainerService.createTrainer(trainerDto);
    }


}

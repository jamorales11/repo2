package com.epam.gymcrm.service;

import com.epam.gymcrm.dto.TrainerDto;
import com.epam.gymcrm.model.Trainer;

import java.util.List;

public interface TrainerService {

    void createTrainer(TrainerDto trainerDto);

    List<Trainer> getAll();

    Trainer get(int id);

    void updateTrainer();
}

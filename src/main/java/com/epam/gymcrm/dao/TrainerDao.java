package com.epam.gymcrm.dao;

import com.epam.gymcrm.model.Trainer;

import java.util.List;

public interface TrainerDao {
    Trainer get(int id);
    List<Trainer> getAll();
    void createTrainer(Trainer trainer);

}

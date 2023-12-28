package com.epam.gymcrm.service;

import com.epam.gymcrm.dao.TrainerDao;
import com.epam.gymcrm.dto.TrainerDto;
import com.epam.gymcrm.model.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService{

    @Autowired
    public TrainerDao trainerDao;

    public void createTrainer(TrainerDto trainerDto) {


        trainerDao.createTrainer(new Trainer(trainerDto.getId(), trainerDto.getSpecialization()));

    }

    public List<Trainer> getAll(){
        return trainerDao.getAll();
    }

    public Trainer get(int id){
        return trainerDao.get(id);
    }

    public void updateTrainer(){

    }
}

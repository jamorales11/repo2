package com.epam.gymcrm.adapters.daoImpl;

import com.epam.gymcrm.domain.ports.dao.TrainerDao;
import com.epam.gymcrm.domain.model.Trainer;
import com.epam.gymcrm.config.storage.Storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Repository
public class TrainerDaoImpl implements TrainerDao {

    private final Logger logger = LoggerFactory.getLogger(TrainerDaoImpl.class);

    public Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Trainer get(int id) {
        //Trainer searched =  storage.getStorage().get("Trainer").get(id);
        return null;
    }

    @Override
    public List<Trainer> getAll() {

        List trainers =  Arrays.asList(storage.getStorage().get("Trainer").values().toArray());
        return trainers;
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        Map<Integer, Object> trainers = storage.getStorage().get("Trainer");
        trainers.put(trainer.getId(),trainer);
        storage.getStorage().put("Trainer",trainers);
        //System.out.println(storage.getStorage());

        logger.debug("Trainer has been saved to the storage");

        return trainer;

    }
}

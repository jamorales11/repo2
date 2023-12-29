package com.epam.gymcrm.adapters.daoImpl;

import com.epam.gymcrm.config.storage.Storage;
import com.epam.gymcrm.domain.model.User;
import com.epam.gymcrm.domain.ports.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl implements UserDao {

    private final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public User get(int id) {
        return (User) storage.getStorage().get("User").get(id);
    }

    @Override
    public List<User> findUsersByFirstNameAndLastName(String firstName, String lastName) {
        List<User> users =  (List) Arrays.asList(storage.getStorage().get("User").values().toArray());
        List<User> usersFound = users.stream().filter(user -> user.getFirstName().equalsIgnoreCase(firstName)  && user.getLastName().equalsIgnoreCase(lastName) ).collect(Collectors.toList());
        return usersFound;
    }

    @Override
    public List<User> getAll() {
        List users = Arrays.asList(storage.getStorage().get("User").values().toArray());
        return users;
    }

    @Override
    public User createUser(User user) {
        Map<Integer, Object> users = storage.getStorage().get("User");
        users.put(user.getId(),user);
        storage.getStorage().put("User",users);

        logger.debug("User has been saved to the storage");

        return user;
    }
}

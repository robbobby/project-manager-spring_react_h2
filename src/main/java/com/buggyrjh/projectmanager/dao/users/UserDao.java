package com.buggyrjh.projectmanager.dao.users;

import com.buggyrjh.projectmanager.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);

    public default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }
    List<User> selectAllUsers();

    Optional<User> selectUserById(UUID id);

    int deletePersonById(UUID id);

    int updateUserById(UUID id, User user);
}

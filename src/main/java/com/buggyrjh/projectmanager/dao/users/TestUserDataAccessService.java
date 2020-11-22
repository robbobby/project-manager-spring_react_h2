package com.buggyrjh.projectmanager.dao.users;


import com.buggyrjh.projectmanager.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("testData")
public class TestUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();
    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getLogin()));
        return 1;
    }
    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return DB.stream().filter(user -> user.getId().equals(id)).findFirst();
    }
    @Override
    public int deletePersonById(UUID id) {
        Optional<User> user = selectUserById(id);
        user.ifPresent(value -> DB.remove(value));
        return 0;
    }
    @Override
    public int updateUserById(UUID id, User user) {
        return selectUserById(id)                                           // Select the user with ID -- know this works
                .map(userToUpdate -> {                                      // Map the return value of the above to 'userToUpdate'
            int indexOfUserToUpdate = DB.indexOf(userToUpdate);             // Get the index of the user and store it
            if (indexOfUserToUpdate >=0) {                                  // Check that it returned a valid user id
                DB.set(indexOfUserToUpdate, new User(id, user.getLogin())); // Update the user in the database
                return 1;                                                   // return 1 if success
            }
            return 0;                                                       // return 0 if fail
        })
          .orElse(0);                                                 // If none of the above worked return 0 for fail
    }
}
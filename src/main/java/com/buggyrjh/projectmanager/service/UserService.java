package com.buggyrjh.projectmanager.service;

import com.buggyrjh.projectmanager.dao.users.UserDao;
import com.buggyrjh.projectmanager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("postgres") UserDao userDao) {
        this.userDao = userDao;
    }
    public int set(User user) {
        return userDao.insertUser(user);
    }
    public Optional<User> select(UUID id) {
        return userDao.selectUser(id);
    }
    public List<User> selectAll() {
        return userDao.selectAllUsers();
    }
    public int delete(UUID id) {
        return userDao.deleteUser(id);
    }
    public int update(UUID id, User user) {
        return userDao.updateUser(id, user);
    }
}
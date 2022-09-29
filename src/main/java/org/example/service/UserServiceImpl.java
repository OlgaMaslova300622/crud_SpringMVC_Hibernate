package org.example.service;

import org.example.dao.UserDAO;
import org.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserDAO userDAO;


    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);

    }
    @Transactional
    @Override
    public void updateUser(int id, User updateUser) {
        userDAO.updateUser(id, updateUser);

    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);

    }
}

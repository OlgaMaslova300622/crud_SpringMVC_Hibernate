package org.example.service;

import org.example.models.User;

import java.util.List;

public interface UserService {

     List<User> getAllUsers();
     User getUserById(int id);
     void saveUser(User user);
     void updateUser(int id, User updateUser);
     void deleteUser(int id);


}

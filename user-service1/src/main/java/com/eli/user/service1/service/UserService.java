/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eli.user.service1.service;

import com.eli.user.service1.dto.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface UserService {

    public List<User> getAllUsers();

    public User getUser(String id);

    public void addUser(User user);
    
    public void updateUser(User user);
    
    public void deleteUser(String id);
    
}
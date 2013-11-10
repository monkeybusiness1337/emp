/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author unfug
 */
public interface UserDAO {
    public List<User> getUsers() throws IllegalArgumentException ;
    public User getUserByName(String userName) throws IllegalArgumentException ;
    public void deleteUser() throws IllegalArgumentException ;
    public void addUser(User user) throws IllegalArgumentException ;
    public void updateUser(User user) throws IllegalArgumentException ;
}

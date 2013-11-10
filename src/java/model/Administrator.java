/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author unfug
 */
public class Administrator extends User{

    public Administrator() {
        super() ;
    }

    public Administrator(String userName, String password, String firstName, String sureName, String birthDate, String registerDate, String about, String picturePath) {
        super(userName, password, firstName, sureName, birthDate, registerDate, about, picturePath);
    }

}

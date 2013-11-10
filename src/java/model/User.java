/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author unfug
 */
public class User implements Serializable{
    
    private String userName ;
    private String password ;
    
    private String firstName ;
    private String sureName ;
    private String birthDate ;
    private String registerDate ;
    private String about ;
    private String picturePath ;

    public User(){
        
    }
    
    public User(String userName, String password, String firstName, 
                String sureName, String birthDate, String registerDate, 
                String about, String picturePath) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.sureName = sureName;
        this.birthDate = birthDate;
        this.registerDate = registerDate;
        this.about = about;
        this.picturePath = picturePath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author unfug
 */
public class Event implements Serializable, NewsfeedItemOutputable{
    
    private String name ;
    private String picturePath ;
    private Date date ;
    private String genre ;
    private String place ;
    private String veranstalter ;
    
    private Event(){
        
    }
    
    private Event(String name, String picturePath, Date date, 
                          String genre, String place, String veranstalter){
        
        this.name = name ;
        this.picturePath = picturePath ;
        this.date = date ;
        this.genre = genre ;
        this.place = place ;
        this.veranstalter = veranstalter ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    @Override
    public String toString(){
       return "" ;
    }

    @Override
    public String getHeadline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getVeranstalter() {
        return veranstalter;
    }

    public void setVeranstalter(String veranstalter) {
        this.veranstalter = veranstalter;
    }
    
    
}

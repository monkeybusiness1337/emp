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
public class Comment implements Serializable, NewsfeedItemOutputable {
    
    private String content ;
    private String date ;
    private String user ;
    private String eventName ;
    private String author ;
    
    public Comment(){
        
    }

    public Comment(String content, String date, String user, String eventName, String author) {
        this.content = content;
        this.date = date;
        this.user = user;
        this.eventName = eventName ;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String getHeadline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    
}

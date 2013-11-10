/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Event;
import java.util.ArrayList;
import java.util.Date;
import model.Comment;
import model.NewsfeedItemOutputable;
import model.User;

/**
 *
 * @author unfug
 */
public class UserController {
 
    private User session ;
    
    public UserController(){
        session = null ;
    }
        
    public boolean register(){
        return true ;
    }
    
    public boolean login(){
        return true ;
    }
    
    public void logout(){
        session = null ;
    }
    
    public ArrayList<User> getFollowerListByUsername(String username){
        return new ArrayList<User>() ;
    }
    
    public ArrayList<Comment> getCommentsByEventName(String eventName){
        return new ArrayList<Comment>() ;
    }
    
    public ArrayList<Event> getEvents(){
        return new ArrayList<Event>() ;
    }
    
    public Event getEventByName(String name){
        return null ;
    }
    
    public ArrayList<Event> getEventsByNameLike(String name){
        return new ArrayList<Event>() ;
    }
    
    public ArrayList<Event> getEventsByGenreLike(String genre){
        return new ArrayList<Event>() ;
    }
    
    public ArrayList<Event> getEventsByTimeInterval(Date begin, Date end){
        return new ArrayList<Event>() ;
    }
    
    public ArrayList<Event> getEventyByPlace(String place){
        return new ArrayList<Event>() ;
    }
    
    public ArrayList<Event> getEventByGuestName(String guestName){
        return new ArrayList<Event>() ;
    }
    
    public ArrayList<NewsfeedItemOutputable> getNewsFeedByUserName(String userName){
        return new ArrayList<NewsfeedItemOutputable>() ;
    }

    public User getSession() {
        return session;
    }

    public void setSession(User session) {
        this.session = session;
    }
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.awt.Event;
import java.util.List;

/**
 *
 * @author unfug
 */
public interface EventDAO {
    
    public List<Event> getEvents() throws IllegalArgumentException ;
    public Event getEventByName(String eventName) throws IllegalArgumentException ;
    public void deleteEvent()  throws IllegalArgumentException ;
    public void addEvent(Event event) throws IllegalArgumentException ;
    public void updateEvent(Event event) throws IllegalArgumentException ;
    
}

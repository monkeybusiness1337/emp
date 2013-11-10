/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;

/**
 *
 * @author unfug
 */
public class AdministratorController extends UserController{
    
    public AdministratorController(){
        super() ;
    }
    
    public void deleteUser(String userName){
        
    }
    
    public void updateUser(String userName){
        
    }

    public int getRegisteredUserCount(){
        return 0 ;
    }
    
    public int getOrganizerCount(){
        return 0 ;
    }
    
    public int getAdministratorCount(){
        return 0 ;
    }
    
    public int getTotalEventCount(){
        return 0 ;
    }
    
    public int getEventCountByEventName(String eventName){
        return 0 ;
    }
    
    public int getEventCountByTimeInterval(Date begin, Date end){
        return 0 ;
    }
    
    public int getEventCountByGenre(String genre){
        return 0 ;
    }
    
    public int getEventCountByOrganizer(String organizer){
        return 0 ;
    }
    
    public int getGuestCountByEventName(){
        return 0 ;
    }
    
    public int getGuestCountByEventOrganizer(){
        return 0 ;
    }
    
}

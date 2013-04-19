/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstatapp;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class UserLoginDatabase {
    
    private User username;
    private User amgunn1 = new User("amgunn1", "Cheese12", "amgunn1@hotmail.com", "Andrew Gunn");
    private User linnyg = new User("linnyg", "steam12", "linnyg@hotmail.com", "Linda Gunn");
    
    
    /**
     * Adds all User objects into the Set, sets a User obj to null,
     * checks if the passed in user's username and password match
     * an entry in the set
     * 
     * @param inputUser
     * @param inputPassword
     * @return userName (User object)
     */
    public User searchForUser(String inputUser, String inputPassword){
        
        Set<User> userSet = new HashSet<>();
        userSet.add(amgunn1);
        userSet.add(linnyg);
        
        setUsername(null);
        

        for (User u: userSet){
            if (inputUser.equals(u.getUsername()) && inputPassword.equals(u.getPassword())){
                setUsername(u);
            }
            
        }
        return username;
       
    }//end
    
    /**
     * gets the userName
     * 
     * @return the user
     */
    public User getUsername() {
        return username;
    }

    /**
     * Sets the username
     * 
     * @param user the user to set
     */
    public void setUsername(User user) {
        this.username = user;
    }
}

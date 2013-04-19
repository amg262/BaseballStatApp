/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstatapp;

import java.util.Objects;

/**
 *
 * Contains framework for User objects. getUser method queries the database
 * set to return another user object.
 * 
 * @author Andy
 */
public class User {
    
    private String username;
    private String password;
    private String email;
    private String name;
    private User user;

    /**
     *
     * @param username
     * @param password
     * @param email
     * @param name
     */
    public User(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    
    /**
     *
     * @param inputUser
     * @param inputPassword
     */
    public User(String inputUser, String inputPassword){
        this.username = inputUser;
        this.password = inputPassword;
    }

    /**
     * retrieves username
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets userName
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets Password
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * gets Email
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets email
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Runs the searchMethod from the database and returns the User
     * @return the user
     */
    public User getUser() {
        UserLoginDatabase uld = new UserLoginDatabase();
        return uld.searchForUser(username, password);
    }

    /**
     * Sets the user
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    
    
    /**
     * Hashcode Method for username and email
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.username);
        hash = 17 * hash + Objects.hashCode(this.email);
        return hash;
    }

    /**
     * equals method compares username and email, and wont let them both be
     * duplicates
     * @param obj
     * @return equals boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    /**
     * user info toString()
     * @return string
     */
    @Override
    public String toString() {
        return "User{" + "username=" + username 
                + ", password=" + password + ", email="
                + email + ", user=" + user + '}';
    }

    /**
     * gets the name of the person who signs in
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author seyfs
 */
public class User {
    private int user_id;
    private String username;
    private String user_password;


    @Override
    public String toString() {
        return "User{" + "username=" + username + ", user_password=" + user_password + '}';
    }

    public User() {
    }

    public User(int user_id, String username, String user_password) {
        this.user_id = user_id;
        this.username = username;
        this.user_password = user_password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
    
    

    
    
    
}

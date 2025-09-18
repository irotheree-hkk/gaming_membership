package com.gaming.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin_users")
public class AdminUser {

    @Id
    private String id;

    private String username;

    private String password;  // Store hashed password in production

    public AdminUser() {}

    public AdminUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getId() { return id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

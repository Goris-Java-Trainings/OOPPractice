package org.example.model;

public class User {
    private String username;
    private String password;
    private String replicaPassword;
    private String email;
    private String answer1;
    private String answer2;

    public User(String username, String password, String replicaPassword, String email) {
        this.username = username;
        this.password = password;
        this.replicaPassword = replicaPassword;
        this.email = email;
    }

    @Override
    public String toString() {
        return "[USER]: \n" +
                "username: " + username +
                "\nemail: " + email;










    }
}

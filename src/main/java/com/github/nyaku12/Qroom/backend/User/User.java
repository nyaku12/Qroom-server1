package com.github.nyaku12.Qroom.backend.User;


import jakarta.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int room_id;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public String getUsername() {
        return username;
    }
}

package com.github.nyaku12.Qroom.backend.User;


import jakarta.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int roomId;

    public User (){};

    public User(String username, int room_id){
        this.roomId = room_id;
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Long getId() {
        return id;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getUsername() {
        return username;
    }
}

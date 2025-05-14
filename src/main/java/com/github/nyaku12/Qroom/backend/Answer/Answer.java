package com.github.nyaku12.Qroom.backend.Answer;


import jakarta.persistence.*;

@Entity
@Table(name="answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String answ;
    private long userId;
    private long roomId;

    public Answer(){};

    public Answer(String answ, long user_id, long room_id) {
        this.answ = answ;
        this.userId = user_id;
        this.roomId = room_id;
    }

    public void setAnsw(String answ) {
        this.answ = answ;
    }

    public void setUser_id(long user_id) {
        this.userId = user_id;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getAnsw() {
        return answ;
    }

    public long getUser_id() {
        return userId;
    }

    public long getRoomId() {
        return roomId;
    }
}

package com.github.nyaku12.Qroom.backend.Answer;


import jakarta.persistence.*;

@Entity
@Table(name="answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String answ;
    private long user_id;
    private long room_id;

    public Answer(){};

    public Answer(String answ, long user_id, long room_id) {
        this.answ = answ;
        this.user_id = user_id;
        this.room_id = room_id;
    }

    public void setAnsw(String answ) {
        this.answ = answ;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public String getAnsw() {
        return answ;
    }

    public long getUser_id() {
        return user_id;
    }

    public long getRoom_id() {
        return room_id;
    }
}

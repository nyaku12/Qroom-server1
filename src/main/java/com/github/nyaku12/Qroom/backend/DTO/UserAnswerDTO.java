package com.github.nyaku12.Qroom.backend.DTO;

public class UserAnswerDTO {
    private Long userId;
    private String username;
    private String answer;
    private String roomname;

    public UserAnswerDTO(){};

    public UserAnswerDTO(Long userId, String username, String answer, String roomname) {
        this.userId = userId;
        this.answer = answer;
        this.username = username;
        this.roomname = roomname;
    }

    public String getRoomname() {
        return roomname;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getAnswer() {
        return answer;
    }

    // Можно добавить toString(), equals(), hashCode() при необходимости
}

package com.github.nyaku12.Qroom.backend.DTO;

public class UserAnswerDTO {
    private Long room_id;
    private String answer;

    public UserAnswerDTO(Long userId, String answer) {
        this.room_id = userId;
        this.answer = answer;
    }

    public Long getRoom_id() {
        return room_id;
    }

    public String getAnswer() {
        return answer;
    }

    // Можно добавить toString(), equals(), hashCode() при необходимости
}

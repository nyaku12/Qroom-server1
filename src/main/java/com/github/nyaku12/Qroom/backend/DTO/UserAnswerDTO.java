package com.github.nyaku12.Qroom.backend.DTO;

public class UserAnswerDTO {
    private Long userId;
    private String username;
    private String answer;

    public UserAnswerDTO(){};

    public UserAnswerDTO(Long userId, String username, String answer) {
        this.userId = userId;
        this.answer = answer;
        this.username = username;
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

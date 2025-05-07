package com.github.nyaku12.Qroom.backend.DTO;

public class UserAnswerDTO {
    private Long userId;
    private String username;
    private String answer;

    public UserAnswerDTO(){};

    public UserAnswerDTO(Long userId, String answer) {
        this.userId = userId;
        this.answer = answer;
    }

    public Long getUserId() {
        return userId;
    }

    public String getAnswer() {
        return answer;
    }

    // Можно добавить toString(), equals(), hashCode() при необходимости
}

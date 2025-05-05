package com.github.nyaku12.Qroom.backend.Answer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Answer saveAnswer(Answer answer){
        return answerRepository.save(answer);
    }
}

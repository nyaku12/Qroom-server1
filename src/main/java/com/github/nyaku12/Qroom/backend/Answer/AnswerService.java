package com.github.nyaku12.Qroom.backend.Answer;


import com.github.nyaku12.Qroom.backend.DTO.UserAnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    public Answer saveAnswer(Answer answer){
        answerRepository.deleteByUserId(answer.getUser_id());
        return answerRepository.save(answer);
    }

}

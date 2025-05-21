package com.github.nyaku12.Qroom.backend.Answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService){this.answerService = answerService;}

    @PostMapping("/create")
    public Answer create(@RequestParam long user_id, @RequestParam long room_id, @RequestParam String answ){

        return answerService.saveAnswer(new Answer(answ, user_id, room_id));
    }

}

package com.github.nyaku12.Qroom.backend.Answer;


import com.github.nyaku12.Qroom.backend.Room.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByAnsw(String answ);
}

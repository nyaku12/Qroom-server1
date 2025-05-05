package com.github.nyaku12.Qroom.backend.Answer;


import com.github.nyaku12.Qroom.backend.DTO.UserAnswerDTO;
import com.github.nyaku12.Qroom.backend.Room.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}

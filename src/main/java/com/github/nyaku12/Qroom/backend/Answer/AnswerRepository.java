package com.github.nyaku12.Qroom.backend.Answer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    void deleteByRoomId(long room_id);
}

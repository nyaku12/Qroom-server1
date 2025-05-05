package com.github.nyaku12.Qroom.backend.Room;

import com.github.nyaku12.Qroom.backend.DTO.UserAnswerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByName(String Name);
    @Transactional
    void deleteByName(String Name);

    @Query(value = "SELECT u.id AS user_id, a.answ AS answ " +
            "FROM users u " +
            "JOIN answers a ON u.id = a.user_id " +
            "WHERE u.room_id = :roomId", nativeQuery = true)
    List<UserAnswerDTO> findUserAnswersByRoomId(@Param("roomId") Long roomId);
}
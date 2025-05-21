package com.github.nyaku12.Qroom.backend.Room;

import com.github.nyaku12.Qroom.backend.DTO.UserAnswerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    Room  findByName(String Name);
    @Transactional
    void deleteByName(String Name);

    @Query(value = "SELECT u.id AS user_id, u.username AS username, a.answ AS answ, r.name AS room_name " +
            "FROM users u " +
            "LEFT JOIN answers a ON u.id = a.user_id " +
            "JOIN rooms r ON u.room_id = r.id " +
            "WHERE u.room_id = :roomId", nativeQuery = true)
    List<UserAnswerDTO> findUserAnswersByRoomId(@Param("roomId") Long roomId);

    @Query(value = "SELECT COUNT(*) FROM users WHERE room_id = :room_id", nativeQuery = true)
    int countUsersByRoomId(@Param("room_id") Long roomId);

}
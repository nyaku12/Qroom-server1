package com.github.nyaku12.Qroom.backend.Room;

import com.github.nyaku12.Qroom.backend.DTO.UserAnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @DeleteMapping("/delete")
    public String deleteRoom(@RequestParam Long room_id){
        return (roomService.deleteRoomById(room_id));
    }

    @PostMapping("/create")
    public Room createRoom(@RequestParam String name, @RequestParam String password) {
        Room room = new Room();
        room.setPassword(password);
        room.setName(name);
        Room savedRoom = roomService.saveRoom(room);
        return savedRoom; // Вернем объект комнаты, чтобы клиент мог получить данные о комнате
    }

    @PostMapping("/get-answers")
    public List<UserAnswerDTO>  getAnswers (@RequestParam long room_id){
        return roomService.answersByRoom_id(room_id);
    }
    @GetMapping("/get-users-ammount")
    public Integer getUsersAmount(@RequestParam long room_id){
        return roomService.countUsersByRoomId(room_id);
    }

    @GetMapping("/get-room-by-name")
    public Room getRoomByName(@RequestParam String name){
        return roomService.findByName(name);
    }
}


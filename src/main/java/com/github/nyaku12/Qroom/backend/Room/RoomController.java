package com.github.nyaku12.Qroom.backend.Room;

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

    @GetMapping
    public List<Room> testDB(){
        return roomService.testroomRepository();
    }

    @DeleteMapping("/delete")
    public String deleteRoom(@RequestParam String name){
        if(roomService.deleteRoomByName(name)) return "Succes";
        else return "There's no such name";
    }

    @PostMapping("/create")
    public Room createRoom(@RequestParam String name,@RequestParam  String password){
        Room room = new Room();
        room.setPassword(password);
        room.setName(name);
        return (roomService.saveRoom(room));
    }

}


package com.github.nyaku12.Qroom.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomrepository;

    public List<Room> testroomRepository(){
        return(roomrepository.findByName("Ivan"));
    }

    public Room saveRoom(Room room){
        return roomrepository.save(room);
    }


    //возвращает true при успешном удалении, false  в иных случаях
    public Boolean deleteRoomByName(String name){
        if(roomrepository.findByName(name) != null){
            roomrepository.deleteByName(name);
            return true;
        }
        return false;
    }
}

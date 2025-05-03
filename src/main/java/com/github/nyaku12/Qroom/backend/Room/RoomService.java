package com.github.nyaku12.Qroom.backend.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomrepository;

    public List<Room> testroomRepository(){
        return(roomrepository.findByName("Ivan"));
    }

    public Room saveRoom(Room room){
        if(roomrepository.findByName(room.getName()).isEmpty() && !room.getName().equals("")){
            return roomrepository.save(room);
        }
        else{
            return new Room("ERR: already exist or null nickname", null);
        }
    }


    //возвращает true при успешном удалении, false  в иных случаях
    public Boolean deleteRoomByName(String name){
        if(!roomrepository.findByName(name).isEmpty()){
            roomrepository.deleteByName(name);
            return true;
        }
        return false;
    }
}

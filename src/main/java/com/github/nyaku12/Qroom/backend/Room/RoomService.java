package com.github.nyaku12.Qroom.backend.Room;

import com.github.nyaku12.Qroom.backend.Answer.AnswerRepository;
import com.github.nyaku12.Qroom.backend.DTO.UserAnswerDTO;
import com.github.nyaku12.Qroom.backend.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomrepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AnswerRepository answerRepository;

    public List<Room> testroomRepository(){
        return(roomrepository.findByName("Ivan"));
    }

    public Room saveRoom(Room room){
        if(roomrepository.findByName(room.getName()).isEmpty() && !room.getName().isEmpty()){
            return roomrepository.save(room);
        }
        else{
            return new Room("ERR: already exist or null nickname", null);
        }
    }

    public Room findByName(String name){
        return roomrepository.findByName(name).get(0);
    }


    @Transactional
    //возвращает true при успешном удалении, false  в иных случаях
    public String deleteRoomByName(String name){
        if(!roomrepository.findByName(name).isEmpty()){
            userRepository.deleteByRoomId(roomrepository.findByName(name).get(0).getId());
            answerRepository.deleteByRoomId(roomrepository.findByName(name).get(0).getId());
            roomrepository.deleteByName(name);
        }
        return "no such room";
    }

    @Transactional
    //возвращает true при успешном удалении, false  в иных случаях
    public String deleteRoomById(Long id){
        if(!roomrepository.findById(id).isEmpty()){
            userRepository.deleteByRoomId(id);
            answerRepository.deleteByRoomId(id);
            roomrepository.deleteById(id);
            return "Succes";
        }
        return "no such room";
    }

    public Integer countUsersByRoomId(Long id){
        return roomrepository.countUsersByRoomId(id);
    }

    public List<UserAnswerDTO> answersByRoom_id(long room_id){
        return roomrepository.findUserAnswersByRoomId(room_id);
    }
}

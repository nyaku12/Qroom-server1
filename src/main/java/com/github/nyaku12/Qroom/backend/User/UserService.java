package com.github.nyaku12.Qroom.backend.User;

import com.github.nyaku12.Qroom.backend.Room.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userrepository;
    public User saveUser(User user){
        return userrepository.save(user);
    }

    public Boolean deleteUserById(long id){
        if(userrepository.findById(id).isPresent()){
            userrepository.deleteById(id);
            return true;
        }
        return false;
    }
}

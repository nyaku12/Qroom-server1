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
        if(userrepository.findByName(user.getUsername()).isEmpty()){
            return userrepository.save(user);
        }
        return new User("ERR: Empty Username", 12);
    }
}

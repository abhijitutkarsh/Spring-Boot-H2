package org.review.springsetup.Service;

import org.review.springsetup.Model.User;
import org.review.springsetup.Repository.UserRepository;
import org.review.springsetup.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserService {
    private final List<UserDto> users = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    private UserRepository userRepository;

    UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(UserDto request){
            User user = new User(request.getName(),request.getEmail());
            return userRepository.save(user);
    }

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}


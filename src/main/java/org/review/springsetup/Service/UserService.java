package org.review.springsetup.Service;

import org.review.springsetup.dto.UserDto;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserService {
    private final List<UserDto> users = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    public UserDto createUser(UserDto user){
            user.setName(user.getName().toUpperCase());
            users.add(user);
            return user;
    }

    public List<UserDto> getAllUser()
    {
        return new ArrayList<>(users);
    }
}


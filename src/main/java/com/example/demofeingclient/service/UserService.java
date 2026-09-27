package com.example.demofeingclient.service;

import com.example.demofeingclient.restclient.placeholder.iclient.UserClient;
import com.example.demofeingclient.restclient.placeholder.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserClient userClient;

    public List<User> getUsers(){
        return userClient.getUsers();
    }
}

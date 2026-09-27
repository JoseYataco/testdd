package com.example.demofeingclient.restclient.placeholder.iclient;


import com.example.demofeingclient.restclient.placeholder.model.User;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "userClient", url = "https://jsonplaceholder.typicode.com/",
configuration = FeignClient.class)
public interface UserClient {

    @GetMapping("/users")
    List<User> getUsers();
}

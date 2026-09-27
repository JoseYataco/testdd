package pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.edu.cibertec.demofeignclient.restclient.config.FeignConfig;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;

import java.util.List;

@FeignClient(name = "userClient",
        url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)
public interface UserClient {
    @GetMapping("/users")
    List<User> getUsers();

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Integer id,
                     @RequestHeader("Authorization") String token);
}

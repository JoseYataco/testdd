package pe.edu.cibertec.demofeignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;
import pe.edu.cibertec.demofeignclient.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user-client")
@RestController
public class UserController {
    private final UserService userService;

    //localhost:8080/api/v1/user-client
    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    //localhost:8080/api/v1/user-client/1
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(
            @PathVariable Integer id) {
        return ResponseEntity.ok(
                userService.getUserById(id, ""));
    }
}

package pe.edu.cibertec.demofeignclient.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.Albums;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;
import pe.edu.cibertec.demofeignclient.service.AlbumService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/album-client")
@RestController
public class AlbunControler {

    private final AlbumService albumService;

    //localhost:8080/api/v1/album-client
    @GetMapping
    public ResponseEntity<List<Albums>> getAlbums() {
        return ResponseEntity.ok(albumService.getAlbums());
    }
}

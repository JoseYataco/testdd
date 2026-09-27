package pe.edu.cibertec.demofeignclient.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient.AlbumClient;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient.UserClient;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.Albums;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlbumService {

    private final AlbumClient albumClient;
    public List<Albums> getAlbums() {
        return albumClient.getAlbums();
    }
}

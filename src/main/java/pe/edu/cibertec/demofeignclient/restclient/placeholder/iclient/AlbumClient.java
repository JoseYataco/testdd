package pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demofeignclient.restclient.config.FeignConfig;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.Albums;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;

import java.util.List;

@FeignClient(name = "albumClient",
        url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)
public interface AlbumClient {
    @GetMapping("/albums")
    List<Albums> getAlbums();

}

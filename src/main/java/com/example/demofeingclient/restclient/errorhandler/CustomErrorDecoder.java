package com.example.demofeingclient.restclient.errorhandler;


import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        return switch (status) {
            case NOT_FOUND -> new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "El recurso no fue encontrado");
            case BAD_GATEWAY -> new ResponseStatusException(
                    HttpStatus.BAD_GATEWAY,
                    "Solicitud incorrectaal API");
            default -> new Exception("Erorr Desconocido");
        };
    }
}

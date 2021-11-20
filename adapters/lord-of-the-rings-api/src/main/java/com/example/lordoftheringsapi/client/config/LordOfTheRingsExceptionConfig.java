package com.example.lordoftheringsapi.client.config;

import com.example.domain.exception.BooksNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;

public class LordOfTheRingsExceptionConfig implements ErrorDecoder {
    private final JacksonDecoder jacksonDecoder = new JacksonDecoder();

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == 404) {
            throw new BooksNotFoundException();
        }

        return new RuntimeException();
    }
}

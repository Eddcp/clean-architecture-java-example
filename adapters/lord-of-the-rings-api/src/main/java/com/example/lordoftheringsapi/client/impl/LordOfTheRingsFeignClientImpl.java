package com.example.lordoftheringsapi.client.impl;

import com.example.domain.LordOfTheRingsBooks;
import com.example.lordoftheringsapi.client.LordOfTheRingsFeignClient;
import com.example.port.client.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LordOfTheRingsFeignClientImpl implements LordOfTheRingsClient {

    private final LordOfTheRingsFeignClient lordOfTheRingsFeignClient;

    @Override
    public LordOfTheRingsBooks getAllBooks() {
        return lordOfTheRingsFeignClient.getAllBooks();
    }

    private HttpHeaders buildHeaderAccountingApi() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(org.springframework.http.HttpHeaders.CONTENT_TYPE, "application/json;");
        headers.add("Authorization",
                "tYLlQbfGdiz1G95pPI41");
        return headers;
    }
}

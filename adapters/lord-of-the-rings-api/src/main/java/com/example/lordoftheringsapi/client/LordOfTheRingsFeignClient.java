package com.example.lordoftheringsapi.client;

import com.example.domain.LordOfTheRingsBooks;
import com.example.lordoftheringsapi.client.config.LordOfTheRingsExceptionConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "lord-of-the-rings-api", url = "https://the-one-api.dev/v2",
    configuration = LordOfTheRingsExceptionConfig.class)
public interface LordOfTheRingsFeignClient {
    @GetMapping("/book")
    LordOfTheRingsBooks getAllBooks();
}

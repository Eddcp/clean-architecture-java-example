package com.example.exampleapi.resource;

import com.example.usecase.GetBooksUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1")
public class LordOfTheRingsResource {

    private final GetBooksUseCase getBooksUseCase;

    @GetMapping(value="/book")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(getBooksUseCase.getAllBooks());
    }
}

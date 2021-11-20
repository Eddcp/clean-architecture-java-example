package com.example.usecase;

import com.example.domain.LordOfTheRingsBooks;
import com.example.port.client.LordOfTheRingsClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetBooksUseCaseImpl implements GetBooksUseCase {

    private final LordOfTheRingsClient lordOfTheRingsClient;

    @Override
    public LordOfTheRingsBooks getAllBooks() {
        return lordOfTheRingsClient.getAllBooks();
    }
}

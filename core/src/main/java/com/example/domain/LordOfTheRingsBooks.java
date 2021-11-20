package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LordOfTheRingsBooks {

    private List<Book> docs;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Book {
        private String _id;

        private String name;
    }

}

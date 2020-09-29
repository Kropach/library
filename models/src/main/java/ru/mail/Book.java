package ru.mail;

import lombok.Data;

public @Data class Book {
    private final String title;
    private final Author author;
}

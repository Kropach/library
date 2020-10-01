package ru.mail;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

public @Data class Book {
    private @NotNull final String title;
    private final Author author;
}

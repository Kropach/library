package ru.mail;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

public @Data class Author {
    private @NotNull final String name;
}

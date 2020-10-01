package ru;

import org.jetbrains.annotations.NotNull;
import ru.mail.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private @NotNull List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public Book getBook(int i){
        return books.get(i);
    }

    public int getSize(){
        return books.size();
    }
}

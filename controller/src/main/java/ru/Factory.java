package ru;

import ru.mail.Author;
import ru.mail.Book;

import java.io.*;

public class Factory {
    public Factory() {
    }

    public Library create(){
        return new Library();
    }

    public Library createLibrary(String path) {
        File file = new File(path);
        Library l = create();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] subLines = line.split(":");
                l.addBook(new Book(subLines[0], new Author(subLines[1])));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }
}

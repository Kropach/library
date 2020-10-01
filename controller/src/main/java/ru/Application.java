package ru;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Application {
    public static void main(String[] args) {
        LibraryFactory libraryFactoryb = new LibraryFactory();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Library l = libraryFactoryb.createLibrary("library.txt");
        for (int i = 0; i < l.getSize(); i++) {
            if (l.getBook(i).getAuthor().getName().equals("Turgenev"))
                System.out.println(gson.toJson(l.getBook(i)));
        }
    }
}

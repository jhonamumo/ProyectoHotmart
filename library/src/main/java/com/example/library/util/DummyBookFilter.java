package com.example.library.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummyBookFilter {
    private final BookService bookService;

    public DummyBookFilter(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init(){
        bookService.addBook(new Book(null, "Don Quijote de la Mancha", "Libro de caballeria", "Miguel de Cervantes Saavedra", 300, 2));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "El Alquimista", "El libro trata sobre los sueños y los medios que utilizamos para alcanzarlos, sobre el azar en nuestra vida y las señales", "Paulo Coelho", 200, 3));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "Veronika decide morir", "Novela contemporánea", "Paulo Coelho", 190, 7));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "Lo que el viento se llevó", "Un clásico de la literatura de los Estados Unidos y debido a su adaptación al cine", "Margaret Mitchell", 250, 5));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "El diario de Ana Frank", "Se conoce la edición de los diarios personales escritos por la niña judía Ana Frank", "Annelies Marie Frank", 120, 2));
    }

    /*
    Post add
    {
        "bookId": "",
        "title": "El diario de Ana Frank",
        "description": "Se conoce la edición de los diarios personales escritos por la niña judía Ana Frank",
        "author": "Annelies Marie Frank",
        "price": 120,
        "qty": 2
    }
    Put update
    {
        "bookId": "1659156137983",
        "title": "El diario de Ana Frank",
        "description": "Se conoce como diarios personales",
        "author": "Annelies Marie Frank",
        "price": 130,
        "qty": 3
    }
    Delete delete
    {
        "bookId": "1659156137983",
        "title": "El diario de Ana Frank",
        "description": "Se conoce como diarios personales",
        "author": "Annelies Marie Frank",
        "price": 130,
        "qty": 3
    }
    */
}

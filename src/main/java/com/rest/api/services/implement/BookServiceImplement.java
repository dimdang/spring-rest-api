package com.rest.api.services.implement;

import com.rest.api.model.Books;
import com.rest.api.repositories.BookRepository;
import com.rest.api.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 4:33 PM
 * Email    : d.dim@gl-f.com
 */

@Service
public class BookServiceImplement implements BooksService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public ArrayList<Books> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public int createBook(Books books) {
        return bookRepository.createBook(books);
    }
}

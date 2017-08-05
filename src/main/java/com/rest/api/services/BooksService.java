package com.rest.api.services;

import com.rest.api.model.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 4:32 PM
 * Email    : d.dim@gl-f.com
 */

@Service
public interface BooksService{

    public ArrayList<Books> getAllBooks();
}

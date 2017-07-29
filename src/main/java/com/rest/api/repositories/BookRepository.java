package com.rest.api.repositories;

import com.rest.api.model.Books;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 3:53 PM
 * Email    : d.dim@gl-f.com
 */
@Repository
public interface BookRepository {

    public final String RS_BOOKS = "Select * from books";

    @Select(RS_BOOKS)
    public ArrayList<Books>getAllBooks();

}

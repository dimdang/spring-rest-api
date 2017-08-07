package com.rest.api.repositories;

import com.rest.api.model.Books;
import org.apache.ibatis.annotations.Insert;
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

    public final String RS_BOOKS =  "SELECT * FROM BOOKS";

    @Select(RS_BOOKS)
    public ArrayList<Books>getAllBooks();

    public final String C_BOOKS  =  "INSERT INTO BOOKS (ISBN,  TITLE, AUTHOR_FIRST_NAME, AUTHOR_LAST_NAME,  GENRE,  PRICE, DESCRIPTION,PUBLISHER_ID,PUBLISHED_ON )values(#{isbn}, #{author_first_name}, #{author_last_name}, #{genre}, #{title}, #{price}, #{description},#{publisher_id}, #{published_on})";
    @Insert(C_BOOKS)
    public int createBook (Books books);

}

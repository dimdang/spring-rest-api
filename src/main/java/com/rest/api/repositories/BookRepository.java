package com.rest.api.repositories;

import com.rest.api.model.Books;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    public final String C_BOOKS  =  "INSERT INTO BOOKS (ISBN,  TITLE, AUTHOR_FIRST_NAME, AUTHOR_LAST_NAME,  GENRE," +
                                    "PRICE, DESCRIPTION,PUBLISHER_ID,PUBLISHED_ON )values(#{isbn}, " +
                                    "#{author_first_name}, #{author_last_name}, #{genre}, #{title}, #{price}, " +
                                    "#{description},#{publisher_id}, #{published_on})";
    @Insert(C_BOOKS)
    public boolean createBook (Books books);

    public final String DEL_UPDATE =  "DELETE FROM TABLE BOOKS WHERE ID = #{id}";

    @Delete(DEL_UPDATE)
    public boolean deleteBook (int id);

    public final String U_BOOKS    =  "UPDATE TABLE BOOKS SET ISBN = #{isbn}, TITLE = #{title}, " +
                                      "AUTHOR_FIRST_NAME = #{author_first_name}, AUTHOR_LAST_NAME = #{author_last_name}" +
                                      "GENRE = #{genre}, PRICE = #{price}, DESCRIPTION = #{description}," +
                                      "PUBLISHER_ID = #{publisher_id}, PUBLISHED_ON = #{published_on} WHERE ID = #{id}";


    @Update(U_BOOKS)
    public boolean updateBooks(Books books);
}

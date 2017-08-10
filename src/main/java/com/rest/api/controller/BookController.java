package com.rest.api.controller;

import com.rest.api.model.Books;
import com.rest.api.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 4:38 PM
 * Email    : d.dim@gl-f.com
 */


@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired
    BooksService booksService;

    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getAllBooks() {
        Map<String, Object> map = new HashMap<>();
        try {
            ArrayList<Books> book = booksService.getAllBooks();
            if (!book.isEmpty()) {
                map.put("DATA", book);
                map.put("STATUS", true);
                map.put("MESSAGE", "DATA FOUND!");
            } else {
                map.put("STATUS", false);
                map.put("MESSAGE", "NOT DATA FOUND!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>>createBook(@RequestBody Books books){
        Map<String, Object> map = new HashMap<>();
        try {
           if (books != null && booksService.createBook(books)){
               map.put("STATUS", true);
               map.put("MESSAGE", "BOOK CREATED...!");
           }else {
               map.put("STATUS", false);
               map.put("MESSAGE", "Internal server error ........... cal bucky for help!");
           }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Map<String, Object>> updateBooks(@RequestBody Books books){
        Map<String, Object> map = new HashMap<>();
        try {
            if (books != null && booksService.updateBooks(books)){
                map.put("STATUS", true);
                map.put("MESSAGE", "BOOK UPDATED...!");
            }else {
                map.put("STATUS", false);
                map.put("MESSAGE", "Internal server error, so update fail........... cal bucky for help!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> deleteBook(@RequestParam int id){
        Map<String, Object> map = new HashMap<>();
        try {
            if (booksService.deleteBook(id)){
                map.put("STATUS", true);
                map.put("MESSAGE", "BOOK HAS BEEN DELETE...!");
            }else {
                map.put("STATUS", false);
                map.put("MESSAGE", "Contact bucky.......!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

}

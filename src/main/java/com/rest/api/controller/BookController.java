package com.rest.api.controller;

import com.rest.api.model.Books;
import com.rest.api.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 4:38 PM
 * Email    : d.dim@gl-f.com
 */

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    BooksService booksService;

    @RequestMapping(value ="/", method = RequestMethod.GET)
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

}

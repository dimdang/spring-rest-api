package com.rest.api.model;

import java.util.Date;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 3:26 PM
 * Email    : d.dim@gl-f.com
 */
public class Books {

    private Integer     id;
    private String      isbn;
    private String      title;
    private String      description;
    private String      author_first_name;
    private String      author_last_name;
    private String      genre;
    private double      price;
    private Integer     publisher_id;
    private Date        published_on;

    public Books() {
    }

    public Books(Integer id, String isbn, String title, String description, String author_first_name, String author_last_name, String genre, double price, Integer publisher_id, Date published_on) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.genre = genre;
        this.price = price;
        this.publisher_id = publisher_id;
        this.published_on = published_on;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public Date getPublished_on() {
        return published_on;
    }

    public void setPublished_on(Date published_on) {
        this.published_on = published_on;
    }
    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorFirstName='" + author_first_name + '\'' +
                ", authorLastName='" + author_last_name + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}

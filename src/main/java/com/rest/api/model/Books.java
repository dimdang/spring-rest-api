package com.rest.api.model;

/**
 * Created by Dang Dim
 * Date     : 29-Jul-17, 3:26 PM
 * Email    : d.dim@gl-f.com
 */
public class Books {

    private Integer id;
    private String isbn;
    private String title;
    private String description;
    private String authorFirstName;
    private String authorLastName;
    private String genre;
    private double price;

    public Books() {
    }

    public Books(Integer id, String isbn, String title, String description, String authorFirstName, String authorLastName, String genre, double price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.price = price;
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

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
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

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}

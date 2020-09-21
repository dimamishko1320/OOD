package com.company.prototype;

public class Book implements Cloneable {
    private String author;
    private String theme;

    public Book(String author, String theme) {
        this.author = author;
        this.theme = theme;
    }

    public String getAuthor() {
        return author;
    }


    public String getTheme() {
        return theme;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
       Book copy = (Book) super.clone();
        return copy;
    }
}

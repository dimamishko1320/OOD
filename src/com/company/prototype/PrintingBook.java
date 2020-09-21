package com.company.prototype;

public class PrintingBook {

    private Book book;

    public PrintingBook(Book book) {
        this.book =book;
    }

    public Book printBook() throws CloneNotSupportedException {
        return (Book) this.book.clone();
    }
}

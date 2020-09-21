package com.company.prototype.Test;

import com.company.prototype.Book;
import com.company.prototype.PrintingBook;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Book book = new Book("Пушкин", "Капитанская дочка");
        PrintingBook pb = new PrintingBook(book);
        Book book1 = pb.printBook();
        Assert.assertEquals(book.getAuthor(), book1.getAuthor());
        Assert.assertEquals(book.getTheme(), book1.getTheme());
    }
}
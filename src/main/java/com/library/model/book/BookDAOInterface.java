package com.library.model.book;

import java.util.List;

public interface BookDAOInterface {
    List<Book> getAllBooks();
    void printTable(List<Book> books);
    void insertBooktoTable(Book book);
    void relateBookGenre(Book book);
    void relateBookAuthor(Book book);
    void updateBookTitle(String currentTitle, String newTitle);
    void deleteBookByTitle(String title);
    void findBookDetailsById(int idBook);
    void findBooksByAuthorID(String author);
    void findBooksByGendreID(String genre);


}
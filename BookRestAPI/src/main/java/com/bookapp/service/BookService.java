package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface BookService {
	List<Book> getAllBooks();
	List<Book> getByAuthor(String Author);
	Book getById(int id);
	List<Book> getByCategory(String Category);

}

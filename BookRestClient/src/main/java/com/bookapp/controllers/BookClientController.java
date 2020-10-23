package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookapp.model.Book;

@RestController
@RequestMapping("/client-api")
public class BookClientController {
	@Autowired
	RestTemplate restTemplate;
	static final String BASEURL="http://localhost:8080/book-api";
	
	@GetMapping("/client-books")
	 public List<Book> showAllBooks(){
		String url=BASEURL+"/books";
		@SuppressWarnings("unchecked")
		List<Book> bookList=restTemplate.getForObject(url, List.class);
		 return bookList;
	 }
	@GetMapping("/client-books/by-author/{author}")
	 public List<Book> showBooksByAuthor(@PathVariable("author")String author){
		String url=BASEURL+"/books-by-author/"+author;
		@SuppressWarnings("unchecked")
		List<Book> bookList=restTemplate.getForObject(url, List.class);
		 return bookList;
	 }
	@GetMapping("/client-books/by-category/{category}")
	 public List<Book> showBooksBycategory(@PathVariable("category")String category){
		String url=BASEURL+"/books-by-category?category="+category;
		@SuppressWarnings("unchecked")
		List<Book> bookList=restTemplate.getForObject(url, List.class);
		 return bookList;
	 }
	@GetMapping("/client-books/by-Id/{bookId}")
	 public Book showBooksById(@PathVariable("bookId")Integer id){
		String url=BASEURL+"/books-by-Id/"+id;
		Book book=restTemplate.getForObject(url, Book.class);
		 return book;
	 }
}

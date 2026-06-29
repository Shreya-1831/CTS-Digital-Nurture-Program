package com.library.services;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void issueBook() {

        System.out.println("========== Library Management System ==========\n");
        System.out.println("Fetching book details from repository...\n");

        System.out.println(bookRepository.getBookDetails());

        System.out.println("Book has been issued successfully.");
        System.out.println("Return Due Date : 15-07-2026");
        System.out.println("===============================================");
    }

}
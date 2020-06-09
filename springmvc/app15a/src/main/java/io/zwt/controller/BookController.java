package io.zwt.controller;

import io.zwt.domain.Book;
import io.zwt.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
final class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/add")
    public @ResponseBody
    String addNewBook(@RequestParam String title, @RequestParam String author) {

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        bookRepository.save(book);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}

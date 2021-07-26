package com.example.JPALEC6;

import com.example.JPALEC6.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;

    //TO Get Details of All the Books
    @RequestMapping(value = "/getBooks", method= RequestMethod.GET)
    public List<Book> getBooks() throws SQLException {
        return bookRepository.findAll();
    }
    //GET BOOK BY ID
    @RequestMapping(value = "/getBookById", method= RequestMethod.GET)
    public Book getBookById(@RequestParam(value="id")int id) throws SQLException {
        return bookRepository.findById(id);
    }
    // GET BOOK BY NAME
    @RequestMapping(value = "/getBookByName", method= RequestMethod.GET)
    public List<Book> getBookByName(@RequestParam(value="name")String name) throws SQLException {
        return bookRepository.findByName(name);
    }
    // GET BOOK BY AUTHOR NAME
    @RequestMapping(value = "/getBookByAuthorName", method= RequestMethod.GET)
    public List<Book> getBookByAuthor(@RequestParam(value="Author")String Author) throws SQLException {
        return bookRepository.findByAuthorName(Author);
    }
    // INSERT BOOK INTO THE DATABASE
    @RequestMapping(value = "/insertBook",method = RequestMethod.POST)
    public  void insertPerson(@RequestBody Book book) throws SQLException {

        bookRepository.save(book);

    }
    // DELETE BOOK FROM THE DATABASE
    @RequestMapping(value="/deleteBook",method = RequestMethod.DELETE)
    public  void deletePerson(@RequestParam(value="id")int id) throws SQLException {
        bookRepository.deleteById(id);
    }

}

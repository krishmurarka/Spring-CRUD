package com.example.JPALEC6.Repository;

import com.example.JPALEC6.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
  
     List<Book> findByAuthorName(String name);
        List<Book>findByName(String name);
        List<Book>findByCost(int cost);
        Book findById(int id);
}

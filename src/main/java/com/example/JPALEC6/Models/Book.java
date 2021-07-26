package com.example.JPALEC6.Models;
import javax.persistence.*;

@Entity
@Table(name="my_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // using hibernate
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // using MySQL SERVER
    private int id;
    private String name,authorName;

    @Column(name="book_price")
    private int cost;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

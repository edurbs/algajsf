package com.github.edurbs.algajsf.view;

import com.github.edurbs.algajsf.domain.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@ViewScoped
@Getter
@Setter
public class BookManager implements Serializable {
    
    private List<Book> books;
    private Book book;

    public BookManager() {
        books = new ArrayList<>();
        book = new Book();
    }
    
    public void add(){
        books.add(book);
        book = new Book();
    }
   
}

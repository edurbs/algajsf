package com.github.edurbs.algajsf.view;

import com.github.edurbs.algajsf.domain.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@ViewScoped
@Getter
@Setter
public class BookManager implements Serializable {
    
    private List<Book> books;
    private Book book;
    private Book selectedBook;
    private String titleSearch;
    private List<Book> filteredBooks=new ArrayList<>();

    public BookManager() {
        books = new ArrayList<>();
        book = new Book();
    }
    
    public void add(){
        books.add(book);
        book = new Book();
    }
    
    public void remove(){
        books.remove(selectedBook);
    }
    
    public String open(){
        return "Bookshelf?faces-redirect=true";
    }
    
    public String startPage(){
        return "start?faces-redirect=true";
    }
    
    public String help(){
        if(books.isEmpty()){
            return "basicHelp?faces-redirect=true";
        }else{
            return "fullHelp?faces-redirect=true";
        }
    }
    
    public void onTitleChanged(ValueChangeEvent event){
        filteredBooks.clear();
        for (Book book : books) {
            if(book.getTitle()!= null
                    && book.getTitle().toLowerCase()
                            .startsWith(event.getNewValue().toString().toLowerCase())){
                filteredBooks.add(book);
            }
        }
               
        
    }
    
}

package com.github.edurbs.algajsf.domain;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book implements Serializable{
    
    private String title;
    private String author;
    private String subject;

}

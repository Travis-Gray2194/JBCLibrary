package me.travisgray.Models;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ${TravisGray} on 2/7/2018.
 */

@Entity
public class ReadingBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    @NotNull
    private String title;

    @NotEmpty
    @NotNull
    private String authour;


    private String yearofpublication;

    private String ISBN;

    private String checkoutstatus;

    private String image;


    public ReadingBook() {
    }

    public ReadingBook(String title, String authour, String yearofpublication, String ISBN, String checkoutstatus, String image) {
        this.title = title;
        this.authour = authour;
        this.yearofpublication = yearofpublication;
        this.ISBN = ISBN;
        this.checkoutstatus = checkoutstatus;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(String yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getCheckoutstatus() {
        return checkoutstatus;
    }

    public void setCheckoutstatus(String checkoutstatus) {
        this.checkoutstatus = checkoutstatus;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }



}

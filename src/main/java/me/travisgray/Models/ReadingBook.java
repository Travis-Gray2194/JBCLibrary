package me.travisgray.Models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

/**
 * Created by ${TravisGray} on 2/7/2018.
 */

@Entity
public class ReadingBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String authour;

    private String yearofpublication;

    private String ISBN;

    private String isCheckedOut;

    public ReadingBook() {
    }

    public ReadingBook(String title, String authour, String yearofpublication, String ISBN, String isCheckedOut) {
        this.title = title;
        this.authour = authour;
        this.yearofpublication = yearofpublication;
        this.ISBN = ISBN;
        this.isCheckedOut = isCheckedOut;
    }

    public String getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(String isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
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

    public String getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(String yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

}

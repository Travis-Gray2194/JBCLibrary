package me.travisgray.DataLoader;

import me.travisgray.Models.ReadingBook;
import me.travisgray.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookDataLoader implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;


    @Override
    public void run(String...strings)throws Exception {

        ReadingBook readingBook1 = new ReadingBook("Rasin in the Sun","Lorraine Hansberry","1959","9780679755319","Borrowed");
        bookRepository.save(readingBook1);


        ReadingBook readingBook2 = new ReadingBook("Java Advanced Principles","Dave Wolf & Fi","2018","2000670755813","Checkout Today");
        bookRepository.save(readingBook2);



    }



}

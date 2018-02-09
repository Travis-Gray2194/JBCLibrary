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

        ReadingBook readingBook1 = new ReadingBook("Rasin in the Sun","Lorraine Hansberry","1959","9780679755319","Borrowed","http://staceythewriter.com/temp/wp-content/uploads/2012/04/Books.jpg");
        bookRepository.save(readingBook1);


        ReadingBook readingBook2 = new ReadingBook("Java Advanced Principles","Dave Wolf & Fi","2018","2000670755813","Checkout Today","https://images-na.ssl-images-amazon.com/images/I/51upooa33SL._SX332_BO1,204,203,200_.jpg");
        bookRepository.save(readingBook2);



    }



}

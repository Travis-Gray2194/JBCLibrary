package me.travisgray.Controller;

import me.travisgray.Models.ReadingBook;
import me.travisgray.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by ${TravisGray} on 2/7/2018.
 */
@Controller
public class JBCLibraryController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
    public String showLibrarypage(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }

    @GetMapping("/ListBook")
    public String listBooks(Model model){
        model.addAttribute("readingbooklist", bookRepository.findAll());
//        Storing Book entries correctly
        return "booklist";
    }

    @GetMapping("/AddBook")
    public String BookForm(Model model){
        model.addAttribute("readingbook",new ReadingBook());
        return "addbookform";
    }



//    Must pass created book entry here then save to repository model for thymeleaf loop
    @PostMapping("/AddBook")
    public String processBookForm(@Valid @ModelAttribute("readingbook") ReadingBook readingBook, BindingResult result, Model model){
        if (result.hasErrors()){
            return "addbookform";
        }
        bookRepository.save(readingBook);
        System.out.println("Test to see checkout status text field being stored correctly"+readingBook.getCheckoutstatus().equalsIgnoreCase("Borrow"));
//        Need to make sure to add all books to model for thymeleaf access after this route is complete
        model.addAttribute("readingbook",bookRepository.findAll());
        return "booklist";
    }

    @GetMapping("/detail/{id}")
    public String showBook(@PathVariable("id") long id, Model model){
//        model.addAttribute("readingbook",bookRepository.findOne(id));

//        Test to see if route fine all books including new user generated book
//        Working correctly now
        model.addAttribute("readingbook",bookRepository.findAll());
        return "booklist";
    }

    @GetMapping("/update/{id}")
    public String updateBooks(@PathVariable("id") long id, Model model){
        model.addAttribute("readingbook",bookRepository.findOne(id));
        return "addbookform";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") long id, Model model){
        model.addAttribute("readingbook",bookRepository.findOne(id));
        bookRepository.delete(id);
        return "booklist";
    }

    @GetMapping("/update/booklist2/{id}")
    public String showmodal(@PathVariable("id") long id, Model model){
        model.addAttribute("readingbook",bookRepository.findAll());
        return "booklist2";
    }


}

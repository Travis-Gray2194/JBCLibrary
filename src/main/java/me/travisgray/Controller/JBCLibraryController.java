package me.travisgray.Controller;

import me.travisgray.Models.ReadingBook;
import me.travisgray.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("books", bookRepository.findAll());
        return "booklist";
    }

    @GetMapping("/AddBook")
    public String BookForm(Model model){
        model.addAttribute("readingbook",new ReadingBook());
        return "addbookform";
    }

    @PostMapping("/ProcessBook")
    public String processBookForm(@Valid ReadingBook readingBook, BindingResult result){
        if (result.hasErrors()){
            return "addbookfrom";
        }
        bookRepository.save(readingBook);
        return "booklist";
    }

    @GetMapping("/detail/{id}")
    public String showBook(@PathVariable("id") long id, Model model){
        model.addAttribute("books",bookRepository.findOne(id));
        return "showbooklist";
    }

    @GetMapping("/update/{id)")
    public String updateBooks(@PathVariable("id") long id, Model model){
        model.addAttribute("books",bookRepository.findOne(id));
        return "addbookform";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") long id){
        bookRepository.delete(id);
        return "redirect:/";
    }


}

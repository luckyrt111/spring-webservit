package spring.restful.demo.demo1.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.restful.demo.demo1.demo1.entity.BookEntity;
import spring.restful.demo.demo1.demo1.repository.BookRepository;

import java.util.List;

/**
 * Created by DELL on 06/13/17.
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Object getAllBook() {
        List<BookEntity> bookEntityList = bookRepository.findAll();

        return bookEntityList;
    }


}

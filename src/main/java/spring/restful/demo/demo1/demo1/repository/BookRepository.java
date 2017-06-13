package spring.restful.demo.demo1.demo1.repository;

import org.springframework.stereotype.Repository;
import spring.restful.demo.demo1.demo1.entity.BookEntity;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 06/13/17.
 */
@Repository
public class BookRepository {
    private List<BookEntity> bookList = new ArrayList<>();

    @PostConstruct
    public void init() {
        // simulate data in a Java list
        // these data can fetched from a table
        bookList.add(new BookEntity(1, "Java A-Z", 13.2, "Roger"));
        bookList.add(new BookEntity(2, ".Net tutorial", 23.9, "Peter"));
    }

    public List<BookEntity> findAll() {
        return bookList;
    }

    public BookEntity save(BookEntity bookEntity) {
        bookList.add(bookEntity);
        return bookEntity;
    }
}

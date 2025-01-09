package vttp.batch5.paf.day._2.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp.batch5.paf.day._2.repository.models.Book;

@Repository
public class KindleRepository {
    
    @Autowired
    private JdbcTemplate template;

    public void getAuthorAverageRating(int bookCount, int limit){
        SqlRowSet rs = template.queryForRowSet(Queries.SQL_SELECT_BOOK_AVERAGE, bookCount, limit);

        List<Book> results = new LinkedList();

    
    }
}
package vttp.batch5.paf.day._2.repository;

public class Queries {
    public static final String SQL_SELECT_BOOK_AVERAGE = "select author, count(title) as number_published from kindle where author != '' group by author having number_published >= ? order by number_published desc limit ?";

    
}

package demo;

import model.Book;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisSession;

import java.util.List;

public class BookTest {
    // Create
    private static void create() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            sqlSession.insert("book.create", new Book(null, "title2...", 123.456, 100, "2018-04-09"));
        }
    }

    // Retrieve
    private static void retrieve(){
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
            List<Book> books = sqlSession.selectList("book.retrieve");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Retrieve
    private static void queryById() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(false)) {
            Book book = sqlSession.selectOne("book.queryById", 1);
            System.out.println(book);
        }
    }

    // Update
    private static void update() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            sqlSession.update("book.update", new Book(1, "new title", 123.00, 10, "2018-4-8"));
        }
    }

    // Delete
    private static void delete() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            sqlSession.delete("book.delete", 2);
        }
    }

    public static void main(String[] args) {
       create();
//        update();
//        queryById();
//       delete();
//        retrieve();
    }
}

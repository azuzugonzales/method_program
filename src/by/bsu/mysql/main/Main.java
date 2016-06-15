package by.bsu.com.mysql.main;

// https://tproger.ru/translations/java-jdbc-example/
// http://www.vogella.com/tutorials/MySQLJava/article.html

import by.bsu.com.mysql.access.MySQLAccess;

public class Main {
    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
}

package orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {

// Session - represents a unit of work and serves as a gateway to interact with the database.
// Sessions are used to perform CRUD (Create, Read, Update, Delete) operations on persistent
// objects.

    public static SessionFactory getSessionFactory(){
        // SessionFactory - Interface responsible for creating and managing Session objects.
        var sessionFactory = new Configuration()
                .setProperty("hibernate.agroal.maxSize", "20")
                // use H2 in-memory database
                .setProperty(URL, "jdbc:h2:mem:db1")
                // default username / password
                .setProperty(USER, "sa") // sa = server administrator
                .setProperty(PASS, "")
                // options to display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .buildSessionFactory();




        return sessionFactory;
    }
}
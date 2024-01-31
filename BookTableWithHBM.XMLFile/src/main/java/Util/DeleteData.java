package Util;

import Model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteData {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        cfg=new Configuration().configure().addAnnotatedClass(Book.class);
        factory=cfg.buildSessionFactory();
        ses=factory.openSession();

        Book b1=ses.load(Book.class,101);

        tx=ses.beginTransaction();
        ses.delete(b1);
        tx.commit();
        ses.close();
        System.out.println("Data Deleted");
    }
}

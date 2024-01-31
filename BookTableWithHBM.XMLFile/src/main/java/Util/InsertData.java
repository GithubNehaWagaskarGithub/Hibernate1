package Util;

import Model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertData {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        cfg=new Configuration().configure().addAnnotatedClass(Book.class);
        factory=cfg.buildSessionFactory();
        ses=factory.openSession();

        Book b1=new Book(101,"Neha",500);
        Book b2=new Book(102,"Ayush",300);
        tx= ses.beginTransaction();
        ses.save(b1);
        ses.save(b2);
        tx.commit();
        ses.close();
        System.out.println("Data Inserted");
    }
}

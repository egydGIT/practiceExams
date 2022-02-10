package exam03retake01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailBoxTest2 {

    MailBox2 mailBox = new MailBox2();

    @BeforeEach
    void init() {
        Mail2 mail1 = new Mail2(new Contact2("John Doe", "johndoe@example.com"),
                List.of(new Contact2("Jane Doe", "janedoe@example.com"),
                        new Contact2("Jack Doe", "jackdoe@example.com")),
                "Doe Family",
                "Hi All!");

        Mail2 mail2 = new Mail2(new Contact2("John Doe", "johndoe@example.com"),
                List.of(new Contact2("John Smith", "johnsmith@example.com")),
                "Johnes",
                "Hi!");

        Mail2 mail3 = new Mail2(new Contact2("John Doe", "johndoe@example.com"),
                List.of(new Contact2("Jane Smith", "janesmith@example.com")),
                "John - Jane",
                "Hello!");

        Mail2 mail4 = new Mail2(new Contact2("Jane Doe", "janedoe@example.com"),
                List.of(new Contact2("John Doe", "johndoe@example.com"),
                        new Contact2("Jack Doe", "jackdoe@example.com")),
                "RE: Doe Family",
                "Rerere!");

        mailBox.addMail(mail1);
        mailBox.addMail(mail2);
        mailBox.addMail(mail3);
        mailBox.addMail(mail4);
    }

    @Test
    void addMail() {
        List<Mail2> mails = mailBox.getMails();
        assertEquals(4, mails.size());
        assertEquals("Rerere!", mails.get(3).getMessage());
    }

    @Test
    void findFrom() {
        List<Mail2> mails =  mailBox.findByCriteria("from:johndoe@example.com");
        assertEquals(3, mails.size());
    }

    @Test
    void findTo() {
        List<Mail2> mails =  mailBox.findByCriteria("to:Jack Doe");
        assertEquals(2, mails.size());

    }

    @Test
    void findSubject() {
        List<Mail2> mails =  mailBox.findByCriteria("Hi");
        assertEquals(2, mails.size());

    }

    @Test
    void findMessage() {
        List<Mail2> mails =  mailBox.findByCriteria("Rerere");
        assertEquals(1, mails.size());

    }
}

package exam03retake01;

import exam03.Boat;

import java.util.List;
import java.util.Map;

public class Mail {

    private Contact from;
    private List<Contact> to;
    private String subject;
    private String message;

    public Mail(Contact from, List<Contact> to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public Contact getFrom() {
        return from;
    }

    public List<Contact> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}

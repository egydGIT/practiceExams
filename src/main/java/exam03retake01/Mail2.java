package exam03retake01;

import java.util.List;

public class Mail2 {

    private Contact2 from;
    private List<Contact2> to;
    private String subject;
    private String message;

    public Mail2(Contact2 from, List<Contact2> to, String subject, String message) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public Contact2 getFrom() {
        return from;
    }

    public List<Contact2> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}

package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public MailBox() {
    }

    public MailBox(List<Mail> mails) {
        this.mails = mails;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {
        if(criteria.contains("from")) {
            return findByFrom(criteria);
        }
        if(criteria.contains("to")) {
            return findByTo(criteria);
        }
        else {
            return findByContent(criteria);
        }
    }

    private List<Mail> findByContent(String criteria) {
        List<Mail> foundMails = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getMessage().contains(criteria) || mail.getSubject().contains(criteria)) {
                foundMails.add(mail);
            }
        }
        return foundMails;
    }

    private List<Mail> findByTo(String criteria) {
        String searchKey = criteria.substring(criteria.indexOf(":")+1);
        List<Mail> foundMails = new ArrayList<>();
        for (Mail mail : mails) {
            List<Contact> tos = mail.getTo();
            for(Contact contact : tos) {
                if(contact.getEmail().contains(searchKey) || contact.getName().contains(searchKey)) {
                    foundMails.add(mail);
                }
            }
        }
        return foundMails;
    }

    private List<Mail> findByFrom(String criteria) {
        String searchKey = criteria.substring(criteria.indexOf(":")+1);
        List<Mail> foundMails = new ArrayList<>();
        for (Mail mail : mails) {
            if (mail.getFrom().getEmail().contains(searchKey) || mail.getFrom().getName().contains(searchKey)) {
                foundMails.add(mail);
            }
        }
        return foundMails;
    }

    public List<Mail> getMails() {
        return mails;
    }


}

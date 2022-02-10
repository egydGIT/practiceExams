package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox2 {

    private List<Mail2> mails = new ArrayList<>();

    public MailBox2() {
    }

    public void addMail(Mail2 mail) {
        mails.add(mail);
    }

    public List<Mail2> findByCriteria(String criteria) {
        List<Mail2> foundMails = new ArrayList<>();
        String withoutPrefix = criteria.substring(criteria.indexOf(":")+1);
        if (criteria.contains("from:")) {
            for (Mail2 mail : mails) {
                if (mail.getFrom().getName().contains(withoutPrefix)
                    || mail.getFrom().getEmail().contains(withoutPrefix)) {
                    foundMails.add(mail);
                }
            }
        }
        if (criteria.contains("to:")) {
            for (Mail2 mail : mails) {
                for (Contact2 contract : mail.getTo()) {
                    if (contract.getName().contains(withoutPrefix)
                        || contract.getEmail().contains(withoutPrefix)) {
                        foundMails.add(mail);
                    }
                }
            }
        }
        else {
            for (Mail2 mail : mails) {
                if (mail.getMessage().contains(withoutPrefix)
                    || mail.getSubject().contains(withoutPrefix)) {
                    foundMails.add(mail);
                }
            }
        }
        return foundMails;
    }

    public List<Mail2> getMails() {
        return mails;
    }

}

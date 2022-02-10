package exam03retake01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    void create() {
        Contact contact = new Contact("John Doe", "johndoe@example.com");
        assertEquals("John Doe", contact.getName());
        assertEquals("johndoe@example.com", contact.getEmail());
    }

    @Test
    void create2() {
        Contact2 contact = new Contact2("John Doe", "johndoe@example.com");
        assertEquals("John Doe", contact.getName());
        assertEquals("johndoe@example.com", contact.getEmail());
    }
}

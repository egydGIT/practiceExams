package exam03retake02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TodoTest2 {

    @Test
    void testCreate() {
        Todo2 todo = new Todo2("Bevásárolni", 1);
        assertEquals("Bevásárolni", todo.getText());
        assertEquals(State2.NON_COMPLETED, todo.getState());
        assertEquals(1, todo.getPriority());
    }

    @Test
    void testComplete() {
        Todo2 todo = new Todo2("Bevásárolni", 1);
        todo.complete();
        assertEquals(State2.COMPLETED, todo.getState());
    }

    @Test
    void exception() {
        assertThrows(IllegalArgumentException.class,
                () -> new Todo2("Invalid", 6));
    }

}

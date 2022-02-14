package exam03retake02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTodoList2 {

    TodoList2 todoList = new TodoList2();

    @BeforeEach
    void init() {
        todoList.addTodo(new Todo2("Bevásárlás", 1));
        todoList.addTodo(new Todo2("Foci", 5));
        todoList.addTodo(new Todo2("Szolgáltató", 2));
        todoList.addTodo(new Todo2("Számlák", 3));
        todoList.addTodo(new Todo2("Vizsga", 1));

        todoList.getTodos().get(2).complete();
        todoList.getTodos().get(4).complete();
    }

    @Test
    void getNumberOfItemsLeft() {
        assertEquals(3, todoList.getNumberOfItemsLeft());
    }

    @Test
    void getMostImportantTodosText() {
        assertEquals(List.of("Bevásárlás", "Vizsga"), todoList.getMostImportantTodosText());
    }

    @Test
    void getMostImportantTodosTextAnother() {
        TodoList anotherTodoList = new TodoList();
        anotherTodoList.addTodo(new Todo("Bevásárlás", 3));
        anotherTodoList.addTodo(new Todo("Foci", 5));
        anotherTodoList.addTodo(new Todo("Szolgáltató", 2));

        assertEquals(List.of("Szolgáltató"), anotherTodoList.getMostImportantTodosText());
    }

    @Test
    void deleteCompleted() {
        todoList.deleteCompleted();

        assertEquals(3, todoList.getTodos().size());
    }
}

package exam03retake02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList2 {

    private List<Todo2> todos = new ArrayList<>();

    public void addTodo(Todo2 todo) {
        todos.add(todo);
    }

    public int getNumberOfItemsLeft() {
        int number = 0;
        for (Todo2 todo : todos) {
            if (todo.getState() == State2.NON_COMPLETED) {
                number++;
            }
        }
        return number;
    }

    public List<String> getMostImportantTodosText() {
        List<String> mostImportant = new ArrayList<>();
        for (Todo2 todo : todos) {
            if (todo.getPriority() == 1) {
                mostImportant.add(todo.getText());
            }
        }
        if (mostImportant.size() == 0) {
            throw new IllegalArgumentException("You don't have important todo. ");
        }
        return mostImportant;
    }

    public void deleteCompleted() {
        Iterator<Todo2> iterator = todos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getState() == State2.COMPLETED) {
                iterator.remove();
            }
        }
    }

    public List<Todo2> getTodos() {
        return todos;
    }
}

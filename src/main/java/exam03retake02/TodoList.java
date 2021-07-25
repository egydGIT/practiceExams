package exam03retake02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(Todo toDo) {
       todos.add(toDo) ;
    }

    public int getNumberOfItemsLeft() {
        int counter = 0;
        for(Todo todo : todos) {
            if(todo.getState().equals(State.NON_COMPLETED)) {
                counter++;
            }
        }
        return counter;
    }

    public List<String> getMostImportantTodosText() {
        List<String> mostImportantTodos = new ArrayList<>();
        int maxPriority = 5;
        for (Todo todo : todos) {
            if(todo.getPriority() < maxPriority) {
                maxPriority = todo.getPriority();
            }
        }
        for(Todo todo : todos) {
            if(todo.getPriority() == maxPriority) {
                mostImportantTodos.add(todo.getText());
            }
        }
        return mostImportantTodos;
    }


    public void deleteCompleted() {
        Iterator<Todo> iter = todos.iterator();
        while (iter.hasNext()) {
            Todo todo = iter.next();
            if(todo.getState().equals(State.COMPLETED)) {
                iter.remove();
            }
        }
    }

    public List<Todo> getTodos() {
        return todos;
    }

}

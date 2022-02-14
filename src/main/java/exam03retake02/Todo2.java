package exam03retake02;

public class Todo2 {

    //text, state és priority, rendre String, State és int típusú.

    private String text;
    private State2 state;
    private int priority;

    public Todo2(String text, int priority) {
        if (priority < 0 || priority > 5) {
            throw new IllegalArgumentException("Priority should be between 0 and 5, but your: " + priority);
        }
        this.text = text;
        this.priority = priority;
        this.state = State2.NON_COMPLETED;
    }

    public void complete() {
        this.state = State2.COMPLETED;
    }

    public String getText() {
        return text;
    }

    public State2 getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

}

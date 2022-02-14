package finalExam.workhours;

import java.time.LocalDate;

public class Data2 {

    private String name;
    private int workHours;
    private LocalDate date;

    public Data2(String name, int workHours, LocalDate date) {
        this.name = name;
        this.workHours = workHours;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public LocalDate getDate() {
        return date;
    }
}

package finalExam.workhours;

import java.time.LocalDate;

public class Data {

    private String name;
    private int workHoursPerDay;
    private LocalDate date;

    public Data(String name, int workHoursPerDay, LocalDate date) {
        this.name = name;
        this.workHoursPerDay = workHoursPerDay;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", workHoursPerDay=" + workHoursPerDay +
                ", date=" + date +
                '}';
    }

}

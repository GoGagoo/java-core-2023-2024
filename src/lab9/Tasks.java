package lab9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Tasks {

    private String title;
    private String description;
    private LocalDate deadline;

    public Tasks(String title, String description, LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
    }

    public void print() {
        System.out.println("Название: " + title);
        System.out.println("Описание: " + description);
        System.out.println("Срок выполнения: " + deadline);
    }

    public static void printTasks(List<Tasks> tasks) {
        if(!tasks.isEmpty()) {
            for (Tasks task : tasks) {
               task.print();
            }
        }
    }

    public static void main(String[] args) {
        List<Tasks> tasks =  new ArrayList<>();
        tasks.add(new Tasks("Завершить проект", "Написать код, протестировать, отправить", LocalDate.of(2024, 4, 10)));
        tasks.add(new Tasks("Сходить в магазин", "Купить продукты на ужин", LocalDate.of(2024, 4, 5)));
        tasks.add(new Tasks("Позвонить другу", "Поздравить с днем рождения", LocalDate.of(2024, 4, 7)));

        printTasks(tasks);
    }
}

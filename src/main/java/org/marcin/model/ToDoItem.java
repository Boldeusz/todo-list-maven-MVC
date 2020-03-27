package org.marcin.model;

import lombok.Data;

import java.time.LocalDate;
// == @Data lombok creates many methods insted of writing it!!! Superb
@Data
public class ToDoItem {

    // == fields ==
    private String id;
    private String title;
    private String details;
    private LocalDate deadline;

    // == constructors ==
    public ToDoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }
}

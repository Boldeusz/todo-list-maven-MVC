package org.marcin.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
// == @Data lombok creates many methods insted of writing it!!! Superb
@Data
@EqualsAndHashCode(of = "id")
// @EqualsAndHashCode(of = {"id", "title"})
public class ToDoItem {

    // == fields ==
    private int id;
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

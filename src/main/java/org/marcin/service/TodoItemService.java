package org.marcin.service;

import org.marcin.model.ToDoData;
import org.marcin.model.ToDoItem;

public interface TodoItemService {

    void addItem(ToDoItem toAdd);

    void removeItem(int id);

    ToDoItem getItem(int id);

    void updateItem(ToDoItem toUpdate);

    ToDoData getData();
}

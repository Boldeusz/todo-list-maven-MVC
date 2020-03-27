package org.marcin.service;

import lombok.Getter;
import org.marcin.model.ToDoData;
import org.marcin.model.ToDoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    // == fields ==
    @Getter
    private final ToDoData data = new ToDoData();

    // == public methods ==

    @Override
    public void addItem(ToDoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem toUpdate) {
        data.updateItem(toUpdate);
    }


}

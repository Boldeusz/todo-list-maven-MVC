package org.marcin.model;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {

    // == fields ==
    private static int idValue = 1;
    private final List<ToDoItem> items = new ArrayList<>();

    // == constructors ==

    public ToDoData() {
    }

    // == public methods ==
    public List<ToDoItem> getItems(){
        return Collections.unmodifiableList(items);
    }
    public void addItem(@NonNull ToDoItem toAdd){

        // instead of @NonNull
//        if (toAdd == null){
//            throw new NullPointerException("toAdd is a required parameter.");
//        }
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }
    public void removeItem(int id){

        ListIterator<ToDoItem> itemListIterator = items.listIterator();

        while (itemListIterator.hasNext()) {
            ToDoItem item = itemListIterator.next();

            if (item.getId() == id){
                itemListIterator.remove();
                break;
            }
        }
    }
}














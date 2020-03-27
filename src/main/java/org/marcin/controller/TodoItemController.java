package org.marcin.controller;

import lombok.extern.slf4j.Slf4j;
import org.marcin.model.ToDoData;
import org.marcin.model.ToDoItem;
import org.marcin.service.TodoItemService;
import org.marcin.util.AttributeNames;
import org.marcin.util.Mappings;
import org.marcin.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {

    // == fields ==
    private final TodoItemService todoItemService;

    // == constructors ==

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // == model attributes ==
    @ModelAttribute
    public ToDoData toDoData() {
        return todoItemService.getData();
    }
    // == handler methods ==
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(Model model){
        ToDoItem toDoItem = new ToDoItem("","", LocalDate.now());
        model.addAttribute(AttributeNames.TODO_ITEM, toDoItem);
        return ViewNames.ADD_ITEM;
    }
    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) ToDoItem toDoItem){
        log.info("todoItem from form = {}", toDoItem);
        todoItemService.addItem(toDoItem);
        return "redirect:/" + Mappings.ITEMS;
    }
}

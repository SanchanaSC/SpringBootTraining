package com.example.todolist.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.todolist.dto.request.TodoRequest;
import com.example.todolist.dto.response.TodoResponse;
import com.example.todolist.entity.Todos;
import com.example.todolist.exceptions.ResourceNotFoundException;
import com.example.todolist.repository.TodoRepo;

@Service
public class TodoService {
    private final TodoRepo todoRepo;

    public TodoService(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }


   // GET ALL TODOS
    public List<TodoResponse> getAllTodos() {
        return todoRepo.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    // GET BY ID
    public TodoResponse getTodoById(Long id) {
        Todos todo = todoRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));

        return mapToResponse(todo);
    }

    // CREATE TODO
    public TodoResponse createTodo(TodoRequest request) {
        Todos todo = new Todos();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());

        Todos saved = todoRepo.save(todo);

        return mapToResponse(saved);
    }

    // UPDATE TODO
    public TodoResponse updateTodo(Long id, TodoRequest request) {
        Todos todo = todoRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));

        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());

        Todos updated = todoRepo.save(todo);

        return mapToResponse(updated);
    }

    // DELETE TODO
    public void deleteTodo(Long id) {
        Todos todo = todoRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));

        todoRepo.delete(todo);
    }

    // MAPPER (Entity → Response DTO)
    private TodoResponse mapToResponse(Todos todo) {
        return new TodoResponse(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription()
        );
    }
    
}

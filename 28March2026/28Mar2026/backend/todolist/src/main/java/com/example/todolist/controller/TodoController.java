package com.example.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.todolist.dto.request.TodoRequest;
import com.example.todolist.dto.response.ApiResponse;
import com.example.todolist.dto.response.TodoResponse;
import com.example.todolist.service.TodoService;

@RestController
@RequestMapping("/todos")
@CrossOrigin(origins = "http://localhost:5173") // ✅ FIXED PORT
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ApiResponse<List<TodoResponse>> getAllTodos() {
        return new ApiResponse<>(true, "Todos fetched", todoService.getAllTodos());
    }

    @GetMapping("/{id}")
    public ApiResponse<TodoResponse> getTodoById(@PathVariable Long id) {
        return new ApiResponse<>(true, "Todo fetched", todoService.getTodoById(id));
    }

    @PostMapping
    public ApiResponse<TodoResponse> createTodo(@RequestBody TodoRequest request) {
        return new ApiResponse<>(true, "Created", todoService.createTodo(request));
    }

    @PutMapping("/{id}")
    public ApiResponse<TodoResponse> updateTodo(@PathVariable Long id,
            @RequestBody TodoRequest request) {
        return new ApiResponse<>(true, "Updated", todoService.updateTodo(id, request));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return new ApiResponse<>(true, "Deleted", null);
    }
}
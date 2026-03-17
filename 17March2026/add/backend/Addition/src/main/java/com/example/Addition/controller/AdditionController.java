package com.example.Addition.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Addition.dto.request.AdditionRequest;
import com.example.Addition.dto.response.AdditionResponse;
import com.example.Addition.dto.response.ApiResponse;
import com.example.Addition.service.AdditionService;

@RestController
@RequestMapping("/addition")
@CrossOrigin(origins = "http://localhost:5173")
public class AdditionController {
    private final AdditionService additionService;

    public AdditionController(AdditionService additionService) {
        this.additionService = additionService;
    }
    
    @PostMapping("/add")
    public ApiResponse<AdditionResponse> getDetails(@RequestBody AdditionRequest request){
        AdditionResponse response = additionService.calculation(request);
        return new ApiResponse<>("successful", response);
    }

    @GetMapping("/all")
    public ApiResponse<List<AdditionResponse>> getAllAdditions() {
    List<AdditionResponse> list = additionService.getEveryAddition();
    return new ApiResponse<>("success", list);
}
    
}

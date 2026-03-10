package com.example.Project1.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project1.Service.StudentService;
import com.example.Project1.dto.request.StudentRequest;
import com.example.Project1.dto.response.ApiResponse;
import com.example.Project1.dto.response.StudentResponse;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping("/calc")
    public ApiResponse getResult(@RequestBody StudentRequest request){
        StudentResponse result = studentService.calStudentResponse(request);
        return new ApiResponse("Success", result);
    }
}

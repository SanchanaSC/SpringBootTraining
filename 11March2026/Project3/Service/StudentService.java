package com.example.Project3.Service;

import org.springframework.stereotype.Service;

import com.example.Project3.dto.request.StudentRequest;
import com.example.Project3.dto.response.StudentResponse;
import com.example.Project3.entity.Student;
import com.example.Project3.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentResponse processStudent(StudentRequest request){
        int total=request.getMarks().stream().mapToInt(Integer::intValue).sum();
        int subjects=request.getMarks().size();
        double percentage=(double) total/subjects;
        String result=percentage>=75?"Pass":"fail";

        Student student = new Student();
        student.setName(request.getName());
        student.setRollNumber(request.getRollNumber());
        student.setPercentage(percentage);
        student.setResult(result);

        studentRepository.save(student);

        return new StudentResponse(request.getName(),request.getRollNumber(),  total, percentage, result);
    }
}

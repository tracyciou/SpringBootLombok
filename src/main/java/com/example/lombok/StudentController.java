package com.example.lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/test")
    public Student test() {
        Student student = new Student();
        student.setId(1);
        student.setName("Tracy");
        return student;
    }
}

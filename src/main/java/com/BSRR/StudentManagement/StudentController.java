package com.BSRR.StudentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap <Integer, Student> hm = new HashMap <> ();

    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
        int key = student.getRollNo();
        hm.put(key, student);
    }

    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("rollNo") Integer rollNo){
        Student student = hm.get(rollNo);
        return student;
    }

}

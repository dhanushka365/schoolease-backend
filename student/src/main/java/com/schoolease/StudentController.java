package com.schoolease;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/services/student")
public record StudentController(StudentService studentService) {
    @PostMapping
    public void registerStudent (@RequestBody StudentRegistrationRequest studentRegistrationRequest){
        log.info("new student registration {}", studentRegistrationRequest);
        studentService.registerStudent(studentRegistrationRequest);
    }
}

package com.learn.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses()
    {
            return Arrays.asList(
                    new Course(1, "AWS", "Self"),
                    new Course(2, "Azure", "Udemy")
    );
    }
}

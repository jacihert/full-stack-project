package com.example.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@CrossOrigin(origins = "http://localhost:3000/" )
@RestController
public class CourseController {
    @Autowired
    CourseRepository repository;
//    private ArrayList<Course> courses = new ArrayList<>();

    @GetMapping("/welcome")
    public String saysHi() {
        return "Jaci :) Welcome to the server side";
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findByid(parseInt(id)));
//        List<Course> courses = getCourses();
//        return courses.stream()
//                .filter(course -> course.getId()==parseInt(id))
//                .findFirst()
//                .orElse(null);
    }

    @GetMapping("/courses")
//    public ArrayList<Course> getCourses(){
    public ResponseEntity<List<Course>> getCourses(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll()) ;
//        return (ArrayList<Course>) repository.findAll();
    }




//    @PutMapping("{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employeeDetails){
//        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee not exist wit id :" + id));
//
//        updateEmployee.setFirstName(employeeDetails.getFirstName());
//        updateEmployee.setLastName(employeeDetails.getLastName());
//        updateEmployee.setEmailId(employeeDetails.getEmailId());
//
//        employeeRepository.save(updateEmployee);
//        return ResponseEntity.ok(updateEmployee);
//    }








    @GetMapping("/course/random")
    public ResponseEntity<Course> getRandomCourse(){
        List<Course> courses = repository.findAll();
        int randomIndex = (int) Math.floor(Math.random() * courses.size());
        return ResponseEntity.status(HttpStatus.OK).body(courses.get(randomIndex));

    }

    @PostMapping("/course")
//    public String createCourse(@RequestBody Course course){
    public ResponseEntity<String> createCourse(@RequestBody Course course){
//        courses.add(course);
        repository.save(course);
//        return "New course added " + course;
        return ResponseEntity.status(HttpStatus.CREATED).body("New course added " + course);
    }

    @DeleteMapping("/course/{id}")
    @Transactional
//    public String deleteById(@PathVariable String id) {
    public ResponseEntity<String> deleteById(@PathVariable String id) {
        repository.deleteByid(parseInt(id));
//        return "Greeting id # " + id + " has been deleted";
        return ResponseEntity.status(HttpStatus.OK).body("Greeting id # " + id + " has been deleted");

//        for (Course course : courses) {
//            if (course.getId() == parseInt(id)) {
//                courses.remove(course);
//                return "this course has been deleted -> id: " + id;
//            }
//        }
//        return "this course does not exist -> id: " + id;
    }

}

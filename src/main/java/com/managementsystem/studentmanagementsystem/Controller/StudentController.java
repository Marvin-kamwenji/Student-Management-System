package com.managementsystem.studentmanagementsystem.Controller;

import com.managementsystem.studentmanagementsystem.Entity.Student;
import com.managementsystem.studentmanagementsystem.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

 @GetMapping("/students")
    public String listStudents(Model model){
     model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
 @GetMapping("/students/new")
 public String createStudentForm(Model model){
    model.addAttribute("student", new Student());
    return "create_student";
 }

 @PostMapping("/students/save")
 public String saveStudent(@ModelAttribute("student") Student student){
     studentService.saveStudent(student);
     return "redirect:/students";
 }
 @GetMapping("/students/edit/{id}")
 public String editStudentForm(@PathVariable Long id, Model model){
     model.addAttribute("student", studentService.getStudentById(id));
     return "edit_student";
 }

 @PostMapping("/students/{id}")
 public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
     //get student from database by id
     Student existingStudent = studentService.getStudentById(id);
     existingStudent.setId(id);
     existingStudent.setFirstName(student.getFirstName());
     existingStudent.setLastName(student.getLastName());
     existingStudent.setEmail(student.getEmail());
     existingStudent.setContact(student.getContact());
     existingStudent.setGender(student.getGender());
     existingStudent.setCourse(student.getCourse());

     studentService.updateStudent(existingStudent);

     return "redirect:/students";
 }
 @GetMapping("/students/{id}")
 public String deleteStudent(@PathVariable Long id){
     studentService.deleteStudentById(id);

     return "redirect:/students";
 }
}

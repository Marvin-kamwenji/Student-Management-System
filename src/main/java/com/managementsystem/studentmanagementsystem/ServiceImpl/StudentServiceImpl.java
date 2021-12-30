package com.managementsystem.studentmanagementsystem.ServiceImpl;

import com.managementsystem.studentmanagementsystem.Entity.Student;
import com.managementsystem.studentmanagementsystem.Repository.StudentRepository;
import com.managementsystem.studentmanagementsystem.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

 private final StudentRepository studentRepository;

    @Override
 public List<Student> getAllStudents(){
    return studentRepository.findAll();
 }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id){
      return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student){
       return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id){
         studentRepository.deleteById(id);
    }
}

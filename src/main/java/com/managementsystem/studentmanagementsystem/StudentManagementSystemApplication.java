package com.managementsystem.studentmanagementsystem;

import com.managementsystem.studentmanagementsystem.Entity.Student;
import com.managementsystem.studentmanagementsystem.Repository.StudentRepository;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

//    @Override
//    public void run(String... args) throws Exception{
//        Student student1 = new Student ();
//        student1.setFirstName("Anthony");
//        student1.setLastName("Murugu");
//        student1.setEmail("anthony@gmail.com");
//        student1.setCourse("Computer Science");
//        student1.setGender("Male");
//        student1.setContact("0789564873");
//        studentRepository.save(student1);
//
//        Student student2 = new Student ();
//        student2.setFirstName("Achile");
//        student2.setLastName("Lore");
//        student2.setEmail("achi@gmail.com");
//        student2.setCourse("Mathematics");
//        student2.setGender("Female");
//        student2.setContact("0756364786");
//        studentRepository.save(student2);
//    }
}

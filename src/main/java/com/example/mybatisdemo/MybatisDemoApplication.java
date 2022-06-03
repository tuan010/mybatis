package com.example.mybatisdemo;

import com.example.config.AppConfig;
import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

@SpringBootApplication
public class MybatisDemoApplication {

    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentService");

        // create student
        Student student1 = new Student("Thuy thuong gia", "Spring", 100, 849589, "thuydam@gmail.com");
//        Student student2 = new Student("Quang", "React", 100, 456, "quang@gmail.com");
//        Student student3 = new Student("Thuy", "Angular", 100, 789, "thuy@gmail.com");

        // insert student
//        studentService.insertStudent(student1);
//        studentService.insertStudent(student2);
//        studentService.insertStudent(student3);
//        System.out.println("insert : " + student1);

        // select all student
        List<Student> listStudents = studentService.selectAllStudent();
//        System.out.println("select all : ");
//        for (Student student : listStudents) {
//            System.out.println(student);
//        }

        // select student by id
        Student studentById = studentService.selectStudentById(4);
        System.out.println(studentById);

        // select student by name
        student1.setName(null);
//        List<Student> listStudentsByName = studentService.getStudentByName(student1);
//        for (Student student: listStudentsByName) {
//            System.out.println(student);
//        }
        // select student by name and phone
        studentById.setName(null);
        List<Student> listStudentByName_Id_phone = studentService.getStudentByName_Id_phone(studentById);
        for (Student student: listStudentByName_Id_phone) {
            System.out.println(student);
        }



        // update student
//        student2.setPercentage(99);
//        studentService.updateStudent(student2);
//        System.out.println("update : " + student2);

// delete student by id
//     studentService.deleteStudentById(student2.getId());
//        System.out.println("delete : " + student2);
    }

}

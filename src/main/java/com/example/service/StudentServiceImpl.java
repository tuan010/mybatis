package com.example.service;

import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public int deleteStudentById(int studentId) {
        return studentMapper.deleteStudentById(studentId);
    }

    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    public Student selectStudentById(int studentId) {
        return studentMapper.selectStudentById(studentId);
    }
}

package com.example.mapper;

import com.example.entity.Student;

import java.util.List;

public interface StudentMapper {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public List<Student> getStudentByName(Student student);
    public List<Student> getStudentByName_Id_phone(Student student);
    public Student selectStudentById(int studentId);
}

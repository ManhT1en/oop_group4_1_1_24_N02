package com.project.group4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.group4.models.Student;
import com.project.group4.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
    public void enterGrade(Long courseId, Long studentId, Double grade) {
        studentRepository.updateGrade(courseId, studentId, grade);
    }
    public List<Student> getStudentsByCourseId(Long courseId) {
        return studentRepository.findStudentsByCourseId(courseId);
    }

}
package com.cloud.repository;

import com.cloud.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> finAll();

    public Student findById(Integer id);

    public void saveOrUpdate(Student student);

    public void deleteById(Integer id);


}

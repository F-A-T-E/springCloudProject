package com.cloud.repository.impl;

import com.cloud.entity.Student;
import com.cloud.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Integer,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1,new Student(1,"张三",22));
        studentMap.put(2,new Student(2,"李四",23));
        studentMap.put(3,new Student(3,"王五",24));
    }

    @Override
    public Collection<Student> finAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }
}

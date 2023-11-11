package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.student.entity.Lecturer;

@Repository
public interface LecturerRepo extends JpaRepository<Lecturer,Integer> {

}
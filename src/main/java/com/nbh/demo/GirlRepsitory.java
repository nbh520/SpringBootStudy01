package com.nbh.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepsitory extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}

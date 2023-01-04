package com.ibmloginrimac.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ibmloginrimac.demo.model.View1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Repository
public interface ViewRepository extends JpaRepository<View1,Integer>{
    List<View1> findAll();
    long count();
    View1 getById(Integer id);
}
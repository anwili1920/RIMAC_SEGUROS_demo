package com.ibmloginrimac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibmloginrimac.demo.dto.ViewResponseDTO;
import com.ibmloginrimac.demo.repository.ViewRepository;

@RestController
@RequestMapping("/view1")
public class Vista1Controller {
    @Autowired
    ViewRepository view1repository;
    @PostMapping
    public ResponseEntity<ViewResponseDTO> vista(){
        return new ResponseEntity<ViewResponseDTO>( (ViewResponseDTO) view1repository.findAll(), HttpStatus.OK); 
    }
}

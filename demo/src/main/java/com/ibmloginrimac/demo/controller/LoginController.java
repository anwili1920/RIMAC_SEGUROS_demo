package com.ibmloginrimac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibmloginrimac.demo.dto.LoginInputDTO;
import com.ibmloginrimac.demo.dto.LoginResponseDTO;
import com.ibmloginrimac.demo.repository.UsuarioRepository;
import com.ibmloginrimac.demo.usecase.LoginUseCase;
import com.ibmloginrimac.demo.utils.Hasher;

@RestController
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    UsuarioRepository usuarioRepository; 

    @Autowired
    Hasher hasher; 
    
    @PostMapping
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginInputDTO loginInputDTO){
        LoginUseCase loginUseCase = new LoginUseCase(usuarioRepository, hasher); 
        return new ResponseEntity<LoginResponseDTO>(loginUseCase.ejecutar(loginInputDTO), HttpStatus.OK); 
    }
}

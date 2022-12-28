package com.ibmloginrimac.demo.usecase;


import java.util.HashMap;
import java.util.Map;

import com.ibmloginrimac.demo.dto.LoginInputDTO;
import com.ibmloginrimac.demo.dto.LoginResponseDTO;
import com.ibmloginrimac.demo.model.Usuario;
import com.ibmloginrimac.demo.repository.UsuarioRepository;
import com.ibmloginrimac.demo.utils.Hasher;
import com.ibmloginrimac.demo.utils.JWTUtils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginUseCase {
    
    UsuarioRepository usuarioRepository;
    
    Hasher hasher; 

    public LoginResponseDTO ejecutar(LoginInputDTO loginInputDTO){
        Usuario usuario = usuarioRepository.findByEmail(loginInputDTO.getEmail()).orElse(null); 
        if(usuario == null || !hasher.compare(loginInputDTO.getPassword(), usuario.getPassword())){
            return new LoginResponseDTO(null); 
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sub", usuario.getId());
        map.put("correo", usuario.getEmail());
        long exp = 3600; 
        return new LoginResponseDTO(JWTUtils.build(exp, map, "123"));
    } 

}

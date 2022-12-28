package com.ibmloginrimac.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.security.crypto.password.PasswordEncoder;
@Component
public class BCryptHasher implements Hasher {
    
    @Autowired
    private PasswordEncoder encoder;
  
    @Override
    public String hash(String decoded) {
    return encoder.encode(decoded);
    }

    @Override
    public boolean compare(String decoded, String hashed) {
    return encoder.matches(decoded, hashed);
    }
  
}

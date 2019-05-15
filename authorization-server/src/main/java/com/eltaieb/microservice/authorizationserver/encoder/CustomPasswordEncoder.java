package com.eltaieb.microservice.authorizationserver.encoder;

 
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service 
public class CustomPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
    	// hash passed value 
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
    	// compare hashed values with one fetched from database
    	// but here I don't only for simplicity
        return charSequence.toString().equals(s);
    }
}

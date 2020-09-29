package com.example.sweater;

import org.springframework.security.crypto.password.PasswordEncoder;

public class DambPasswodEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return String.format("%s", charSequence);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return false;
    }
}

package com.gustavo.pacchetto_sicurezza.service;

import com.gustavo.pacchetto_sicurezza.payload.LoginDto;
import com.gustavo.pacchetto_sicurezza.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}

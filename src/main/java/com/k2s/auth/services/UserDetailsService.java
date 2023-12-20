package com.k2s.auth.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
User	loadUserByUsername(String username)
            throws UsernameNotFoundException;

}

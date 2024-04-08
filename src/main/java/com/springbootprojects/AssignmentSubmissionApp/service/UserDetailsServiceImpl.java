package com.springbootprojects.AssignmentSubmissionApp.service;

import com.springbootprojects.AssignmentSubmissionApp.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode("easypass"));
        user.setId(1L);
        return user;
    }
}

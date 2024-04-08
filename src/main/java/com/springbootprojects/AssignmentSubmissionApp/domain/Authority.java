package com.springbootprojects.AssignmentSubmissionApp.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Data
@NoArgsConstructor
public class Authority implements GrantedAuthority {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String authority;
    @ManyToOne (optional = false)
    private User user;

    public Authority(String authority){
        this.authority = authority;
    }
}

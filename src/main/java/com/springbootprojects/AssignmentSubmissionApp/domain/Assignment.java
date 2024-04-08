package com.springbootprojects.AssignmentSubmissionApp.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Assignment {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String status;
    private String githubUrl;
    private String branch;
    private String codeReviewUrl;
    @ManyToOne (optional = false)
    private User user;

}

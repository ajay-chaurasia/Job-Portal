package com.jobportal.jobportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;
}

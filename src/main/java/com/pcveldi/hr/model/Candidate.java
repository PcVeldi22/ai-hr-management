package com.pcveldi.hr.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "candidates")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String email;

    private String phone;
    private String jobId;

    @Column(columnDefinition = "TEXT")
    private String resumeSummary;

    @ElementCollection
    @CollectionTable(name = "candidate_skills")
    private List<String> skills;

    private Integer yearsOfExperience;
    private Double matchScore;

    @Enumerated(EnumType.STRING)
    private CandidateStatus status;

    @Column(nullable = false)
    private LocalDateTime appliedAt;

    @PrePersist
    protected void onCreate() {
        appliedAt = LocalDateTime.now();
        status = CandidateStatus.APPLIED;
    }

    public enum CandidateStatus {
        APPLIED, SCREENING, INTERVIEW, OFFER, HIRED, REJECTED
    }
}

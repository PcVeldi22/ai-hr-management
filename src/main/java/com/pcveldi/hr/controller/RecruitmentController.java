package com.pcveldi.hr.controller;

import com.pcveldi.hr.model.Candidate;
import com.pcveldi.hr.service.ResumeAnalysisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recruitment")
@RequiredArgsConstructor
public class RecruitmentController {

    private final ResumeAnalysisService resumeAnalysisService;

    @PostMapping("/candidates/upload")
    public ResponseEntity<Candidate> uploadResume(
            @RequestParam("file") MultipartFile file,
            @RequestParam String jobId) {
        Candidate candidate = resumeAnalysisService.analyzeResume(file, jobId);
        return ResponseEntity.ok(candidate);
    }

    @GetMapping("/candidates/{jobId}")
    public ResponseEntity<List<Candidate>> getCandidatesForJob(@PathVariable String jobId) {
        return ResponseEntity.ok(resumeAnalysisService.getCandidatesByJob(jobId));
    }

    @GetMapping("/candidates/{candidateId}/score")
    public ResponseEntity<Double> getMatchScore(@PathVariable Long candidateId) {
        return ResponseEntity.ok(resumeAnalysisService.getMatchScore(candidateId));
    }
}

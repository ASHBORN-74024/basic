package com.sysintelli.application.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysintelli.application.basic.entity.CandidateInfo;
import com.sysintelli.application.basic.service.CandidateService;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

@Autowired
private CandidateService candidateService;

@GetMapping("/candidate-list")
public List<CandidateInfo> allCandidate() {
return candidateService.getAllCandidates();
}

@PostMapping("/add-candidate")
public CandidateInfo addCandidate(@RequestBody CandidateInfo candidateInfo) {
return candidateService.addCandidates(candidateInfo);
}

}

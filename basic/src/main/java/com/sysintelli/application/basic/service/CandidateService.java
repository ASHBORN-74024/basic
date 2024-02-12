package com.sysintelli.application.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysintelli.application.basic.entity.CandidateInfo;
import com.sysintelli.application.basic.repository.CandidateRepository;

@Service
public class CandidateService {
@Autowired
private CandidateRepository candidateRepository;

   public List<CandidateInfo> getAllCandidates() {
       return candidateRepository.findAll();
}

public CandidateInfo addCandidates(CandidateInfo  candidateInfo) {

return candidateRepository.save(candidateInfo);
}
}


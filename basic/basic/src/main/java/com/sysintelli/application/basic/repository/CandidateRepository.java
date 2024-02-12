package com.sysintelli.application.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysintelli.application.basic.entity.CandidateInfo;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateInfo, Integer > {



}
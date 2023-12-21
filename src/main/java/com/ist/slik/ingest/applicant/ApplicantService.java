package com.ist.slik.ingest.applicant;

import com.ist.slik.ingest.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplicantService {

    private final ApplicantRespository _applicantRepo;
    @Autowired
    public ApplicantService(ApplicantRespository applicantRepo) {
        _applicantRepo = applicantRepo;
    }
    public Page<Applicant> getAll(Pageable paging){
        return _applicantRepo.findAll(paging);
    }
    public Applicant add(Applicant applicant){
        return _applicantRepo.save(applicant);
    }
    public void delete(UUID applicantId){
        _applicantRepo.deleteById(applicantId);
    }
}

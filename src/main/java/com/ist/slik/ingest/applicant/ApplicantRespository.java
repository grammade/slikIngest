package com.ist.slik.ingest.applicant;

import com.ist.slik.ingest.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ApplicantRespository extends JpaRepository<Applicant, UUID> {

}

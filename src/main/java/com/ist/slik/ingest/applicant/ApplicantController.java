package com.ist.slik.ingest.applicant;

import com.ist.slik.ingest.dto.ApplicantDto;
import com.ist.slik.ingest.entity.Applicant;
import com.ist.slik.ingest.utils.mapper.ApplicantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/slik/ingest/applicant")
public class ApplicantController {
    private final ApplicantService _applicantService;
    @Autowired
    public ApplicantController(ApplicantService applicantService){
        this._applicantService = applicantService;
    }

    @GetMapping()
    public Page<Applicant> getApplicants(Pageable paging){
        return _applicantService.getAll(paging);
    }

    @PostMapping()
    public Applicant insertApplicant(@RequestBody ApplicantDto applicant){
        var newApp = ApplicantMapper.INSTANCE.dtoToEntity(applicant);
        return _applicantService.add(newApp);
    }

}

package com.ist.slik.ingest.utils;

import com.github.javafaker.Bool;
import com.github.javafaker.Faker;
import com.ist.slik.ingest.applicant.ApplicantRespository;
import com.ist.slik.ingest.entity.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ApplicantRespository _applicantRepo;

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        int n = 1;

        for (int i = 0; i < n; i++) {
            var applicant = new Applicant();
            applicant.setName(faker.name().fullName());
            applicant.setDob(faker.date().birthday());
            applicant.setNik(faker.number().digits(13));
            applicant.setStatus(faker.bool().equals(true) ? "1" : "0");
            applicant.setCreatedAt(LocalDateTime.now());
            applicant.setCreatedBy("SYSTEM SEEDER");

            _applicantRepo.save(applicant);
        }
    }
}

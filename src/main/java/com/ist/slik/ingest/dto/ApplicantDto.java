package com.ist.slik.ingest.dto;

import com.ist.slik.ingest.entity.Applicant;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.sql.Date;
import java.util.UUID;

@Data
public class ApplicantDto {
    private String requestReffId;
    private String name;
    private Date dob;
    private String pob;
    private String nik;
    private String npwp;
    private char gender;
    private String adress;
    private String motherName;
    private char customerType;
    private String productId;
    private String channel;
    private String purposeCode;
    private String requestor;
    private String requestorName;
    private String flag;

}



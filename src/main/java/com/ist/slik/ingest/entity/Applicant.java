package com.ist.slik.ingest.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table
@Accessors(chain = true)
public class Applicant extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID applicantId;

    @Column(length = 20)
    private String requestReffId;
    @Column(length = 255)
    private String name;
    private Date dob;
    @Column(length = 50)
    private String pob;
    @Column(length = 30)
    private String nik;
    @Column(length = 30)
    private String npwp;
    @Column(length = 1)
    private String gender;
    @Column(length = 255)
    private String adress;
    @Column(length = 50)
    private String motherName;
    @Column(length = 1)
    private String customerType;
    @Column(length = 10)
    private String productId;
    @Column(length = 10)
    private String channel;
    private String purposeCode;
    private String requestor;
    private String requestorName;
    private String status;
    private String flag;
    @Column(length = 255)
    private String idebPath;
    @Column(length = 255)
    private String message;

    public Applicant() {
        setCreatedAt(LocalDateTime.now());
        setProductId("SME");
        setChannel("CASH");
    }

    public void setDob(java.util.Date dob) {
        this.dob = new Date(dob.getTime());
    }
}

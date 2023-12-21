package com.ist.slik.ingest.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {
    @Value("{LocalDateTime.now()")
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}

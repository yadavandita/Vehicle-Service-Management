package com.vehicle.service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity @Table(name="service_records")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ServiceRecord {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long vehicleId;
    private String serviceType;
    private String description;
    private Double cost;
    private LocalDate serviceDate;
    private String status;
}

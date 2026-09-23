package com.vehicle.service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name="vehicles")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Vehicle {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ownerName;
    private String vehicleNumber;
    private String brand;
    private String model;
    private Integer year;
    private String fuelType;
}

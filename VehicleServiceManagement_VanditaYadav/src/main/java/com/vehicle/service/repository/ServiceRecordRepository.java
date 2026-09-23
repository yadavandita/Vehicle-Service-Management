package com.vehicle.service.repository;
import com.vehicle.service.entity.ServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ServiceRecordRepository extends JpaRepository<ServiceRecord, Long> {
    List<ServiceRecord> findByVehicleId(Long vehicleId);
}

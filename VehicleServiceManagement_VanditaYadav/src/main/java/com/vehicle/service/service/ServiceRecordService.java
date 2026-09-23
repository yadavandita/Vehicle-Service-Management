package com.vehicle.service.service;

import com.vehicle.service.entity.ServiceRecord;
import com.vehicle.service.repository.ServiceRecordRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceRecordService {
    private final ServiceRecordRepository repo;
    public ServiceRecordService(ServiceRecordRepository repo) { this.repo = repo; }
    public List<ServiceRecord> getAll() { return repo.findAll(); }
    public List<ServiceRecord> byVehicle(Long id) { return repo.findByVehicleId(id); }
    public ServiceRecord save(ServiceRecord r) { return repo.save(r); }
    public ServiceRecord update(Long id, ServiceRecord r) {
        ServiceRecord old = repo.findById(id).orElseThrow();
        old.setVehicleId(r.getVehicleId()); old.setServiceType(r.getServiceType());
        old.setDescription(r.getDescription()); old.setCost(r.getCost());
        old.setServiceDate(r.getServiceDate()); old.setStatus(r.getStatus());
        return repo.save(old);
    }
    public void delete(Long id) { repo.deleteById(id); }
}

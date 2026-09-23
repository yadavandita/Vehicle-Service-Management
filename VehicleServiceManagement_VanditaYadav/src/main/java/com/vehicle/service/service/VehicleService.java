package com.vehicle.service.service;

import com.vehicle.service.entity.Vehicle;
import com.vehicle.service.repository.VehicleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository repo;
    public VehicleService(VehicleRepository repo) { this.repo = repo; }
    public List<Vehicle> getAll() { return repo.findAll(); }
    public List<Vehicle> getByOwner(String owner) { return repo.findByOwnerNameIgnoreCase(owner); }
    public Vehicle get(Long id) { return repo.findById(id).orElseThrow(); }
    public Vehicle save(Vehicle v) { return repo.save(v); }
    public Vehicle update(Long id, Vehicle v) {
        Vehicle old = get(id);
        old.setOwnerName(v.getOwnerName()); old.setVehicleNumber(v.getVehicleNumber());
        old.setBrand(v.getBrand()); old.setModel(v.getModel());
        old.setYear(v.getYear()); old.setFuelType(v.getFuelType());
        return repo.save(old);
    }
    public void delete(Long id) { repo.deleteById(id); }
}

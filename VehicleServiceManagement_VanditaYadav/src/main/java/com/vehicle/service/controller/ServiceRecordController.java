package com.vehicle.service.controller;

import com.vehicle.service.entity.ServiceRecord;
import com.vehicle.service.service.ServiceRecordService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController @RequestMapping("/api/services")
public class ServiceRecordController {
    private final ServiceRecordService service;
    public ServiceRecordController(ServiceRecordService service) { this.service = service; }

    @GetMapping public List<ServiceRecord> all() { return service.getAll(); }
    @GetMapping("/vehicle/{vehicleId}") public List<ServiceRecord> byVehicle(@PathVariable Long vehicleId) { return service.byVehicle(vehicleId); }
    @PostMapping public ServiceRecord create(@RequestBody ServiceRecord r) { return service.save(r); }
    @PutMapping("/{id}") public ServiceRecord update(@PathVariable Long id, @RequestBody ServiceRecord r) { return service.update(id,r); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Service record deleted successfully"; }
}

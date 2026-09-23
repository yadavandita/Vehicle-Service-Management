package com.vehicle.service.controller;

import com.vehicle.service.entity.Vehicle;
import com.vehicle.service.service.VehicleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController @RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleService service;
    public VehicleController(VehicleService service) { this.service = service; }

    @GetMapping public List<Vehicle> all() { return service.getAll(); }
    @GetMapping("/{id}") public Vehicle get(@PathVariable Long id) { return service.get(id); }
    @GetMapping("/owner/{owner}") public List<Vehicle> byOwner(@PathVariable String owner) { return service.getByOwner(owner); }
    @PostMapping public Vehicle create(@RequestBody Vehicle v) { return service.save(v); }
    @PutMapping("/{id}") public Vehicle update(@PathVariable Long id, @RequestBody Vehicle v) { return service.update(id,v); }
    @DeleteMapping("/{id}") public String delete(@PathVariable Long id) { service.delete(id); return "Vehicle deleted successfully"; }
}

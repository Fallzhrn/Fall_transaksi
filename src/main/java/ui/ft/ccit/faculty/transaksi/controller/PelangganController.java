package ui.ft.ccit.faculty.transaksi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ui.ft.ccit.faculty.transaksi.model.Pelanggan;
import ui.ft.ccit.faculty.transaksi.service.PelangganService;
import java.util.List;

@RestController
@RequestMapping("/api/pelanggan")
public class PelangganController {

    @Autowired
    private PelangganService service;

    @GetMapping
    public List<Pelanggan> getAll() { return service.findAll(); }

    @PostMapping
    public Pelanggan create(@RequestBody Pelanggan data) { return service.save(data); }

    @PutMapping("/{id}")
    public Pelanggan update(@PathVariable String id, @RequestBody Pelanggan data) {
        data.setIdPelanggan(id); 
        return service.save(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) { service.delete(id); }
}
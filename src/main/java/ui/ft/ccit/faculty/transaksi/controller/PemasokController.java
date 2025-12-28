package ui.ft.ccit.faculty.transaksi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ui.ft.ccit.faculty.transaksi.pemasok.model.Pemasok;
import ui.ft.ccit.faculty.transaksi.service.PemasokService;

import java.util.List;

@RestController
@RequestMapping("/api/pemasok")
public class PemasokController {

    @Autowired
    private PemasokService service;

    @GetMapping
    public List<Pemasok> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pemasok getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Pemasok create(@RequestBody Pemasok data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    public Pemasok update(@PathVariable String id, @RequestBody Pemasok data) {
        data.setIdPemasok(id);
        return service.save(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
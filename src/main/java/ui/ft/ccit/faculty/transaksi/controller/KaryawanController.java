package ui.ft.ccit.faculty.transaksi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ui.ft.ccit.faculty.transaksi.model.Karyawan;
import ui.ft.ccit.faculty.transaksi.service.KaryawanService;

import java.util.List;

@RestController
@RequestMapping("/api/karyawan")
public class KaryawanController {

    @Autowired
    private KaryawanService service;

    @GetMapping
    public List<Karyawan> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Karyawan getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Karyawan create(@RequestBody Karyawan data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    public Karyawan update(@PathVariable String id, @RequestBody Karyawan data) {
        data.setIdKaryawan(id);
        return service.save(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
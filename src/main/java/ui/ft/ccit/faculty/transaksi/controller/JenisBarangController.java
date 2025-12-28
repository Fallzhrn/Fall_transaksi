package ui.ft.ccit.faculty.transaksi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ui.ft.ccit.faculty.transaksi.jenisbarang.model.JenisBarang;
import ui.ft.ccit.faculty.transaksi.service.JenisBarangService;

import java.util.List;

@RestController
@RequestMapping("/api/jenisbarang")
public class JenisBarangController {

    @Autowired
    private JenisBarangService service;

    @GetMapping
    public List<JenisBarang> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public JenisBarang getById(@PathVariable Byte id) {
        return service.findById(id);
    }

    @PostMapping
    public JenisBarang create(@RequestBody JenisBarang data) {
        return service.save(data);
    }

    @PutMapping("/{id}")
    public JenisBarang update(@PathVariable Byte id, @RequestBody JenisBarang data) {
        data.setIdJenisBarang(id); // Set ID agar update, bukan insert baru
        return service.save(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Byte id) {
        service.delete(id);
    }
}
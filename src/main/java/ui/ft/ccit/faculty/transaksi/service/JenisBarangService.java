package ui.ft.ccit.faculty.transaksi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ui.ft.ccit.faculty.transaksi.jenisbarang.model.JenisBarang;
import ui.ft.ccit.faculty.transaksi.jenisbarang.model.JenisBarangRepository;

import java.util.List;

@Service
public class JenisBarangService {

    @Autowired
    private JenisBarangRepository repo;

    public List<JenisBarang> findAll() {
        return repo.findAll();
    }

    public JenisBarang findById(Byte id) {
        return repo.findById(id).orElse(null);
    }

    public JenisBarang save(JenisBarang data) {
        return repo.save(data);
    }

    public void delete(Byte id) {
        repo.deleteById(id);
    }
}
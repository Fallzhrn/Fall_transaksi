package ui.ft.ccit.faculty.transaksi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ui.ft.ccit.faculty.transaksi.model.Pelanggan;
import ui.ft.ccit.faculty.transaksi.model.PelangganRepository; // Sesuaikan package
import java.util.List;

@Service
public class PelangganService {

    @Autowired
    private PelangganRepository repo;

    public List<Pelanggan> findAll() { return repo.findAll(); }

    public Pelanggan findById(String id) { return repo.findById(id).orElse(null); }

    public Pelanggan save(Pelanggan data) { return repo.save(data); }

    public void delete(String id) { repo.deleteById(id); }
}
package ui.ft.ccit.faculty.transaksi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ui.ft.ccit.faculty.transaksi.model.Karyawan;
import ui.ft.ccit.faculty.transaksi.model.KaryawanRepository;
import java.util.List;

@Service
public class KaryawanService {

    @Autowired
    private KaryawanRepository repo;

    public List<Karyawan> findAll() {
        return repo.findAll();
    }

    public Karyawan findById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Karyawan save(Karyawan data) {
        return repo.save(data);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
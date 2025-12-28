package ui.ft.ccit.faculty.transaksi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ui.ft.ccit.faculty.transaksi.pemasok.model.Pemasok; 
import ui.ft.ccit.faculty.transaksi.pemasok.model.PemasokRepository; 

import java.util.List;

@Service
public class PemasokService {

    @Autowired
    private PemasokRepository repo;

    public List<Pemasok> findAll() {
        return repo.findAll();
    }

    public Pemasok findById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Pemasok save(Pemasok data) {
        return repo.save(data);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
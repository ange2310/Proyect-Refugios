package com.example.demo.Refugio;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RefugioService {

    private final RefugioRepository refugioRepo;

    public RefugioService(RefugioRepository refugioRepo) {
        this.refugioRepo = refugioRepo;
    }
    public void createRefugio(Refugio refugio) {
        refugioRepo.save(refugio);
    }
    public List<Refugio> getAllRefugios() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllRefugios'");
    }
    public Object getRefugioById(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'getRefugioById'");
    }
    public void updateRefugio(Integer id, Refugio updatedRefugio) {
        throw new UnsupportedOperationException("Unimplemented method 'updateRefugio'");
    }

    public void deleteRefugio(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteRefugio'");
    }
}

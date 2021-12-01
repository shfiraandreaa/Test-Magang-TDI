package com.testmagang.service;


import java.util.Optional;

import javax.transaction.Transactional;


import com.testmagang.entity.Penduduk;
import com.testmagang.repo.PendudukRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PendudukService {

    @Autowired
    private PendudukRepo repo;

    public Iterable<Penduduk> findAll() {
        return repo.findAll();
    }

    public void addPenduduk(Penduduk penduduk) {
        repo.save(penduduk);
    }

    public void deleteById(long nip){
        repo.deleteById(nip);
    }

    public Optional<Penduduk> findById(long nip){
        return repo.findById(nip);
    }

    public void updatePenduduk(Penduduk penduduk){
        repo.save(penduduk);
    }
}

package com.testmagang.repo;

import com.testmagang.entity.Penduduk;

import org.springframework.data.repository.CrudRepository;

public interface PendudukRepo extends CrudRepository<Penduduk, Long>{
    
}


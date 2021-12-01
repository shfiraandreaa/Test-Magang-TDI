package com.testmagang.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabel_penduduk")
public class Penduduk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nip;
    
    @Column(length=50, nullable=false)
    private String nama_lengkap;

    private Date tanggal_lahir;

    @Column(length=50)
    private String tempat_lahir;


    public Penduduk() {
    }


    public Long getNip() {
        return this.nip;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }

    public String getNama_lengkap() {
        return this.nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public Date getTanggal_lahir() {
        return this.tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTempat_lahir() {
        return this.tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }
    
}

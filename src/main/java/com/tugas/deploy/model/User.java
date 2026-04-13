package com.tugas.deploy.model;


public class User {
    private Long id;
    private String nama;
    private String nim;
    private String jenisKelamin;

    public User() {}

    public User(Long id, String nama, String nim, String jenisKelamin) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}

package com.example.pegawai.repository;

import com.example.pegawai.domain.Pegawai;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface PegawaiRepository extends CrudRepository<Pegawai, Integer> {
}

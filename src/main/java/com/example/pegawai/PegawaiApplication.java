package com.example.pegawai;

import com.example.pegawai.domain.Pegawai;
import com.example.pegawai.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PegawaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegawaiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(@Autowired PegawaiRepository pegawaiRepository) {
		return (x) -> {
			Pegawai pegawai = new Pegawai();
			pegawai.setNama("Syabana Tri Wahyudi");
			pegawai.setAlamat("Depok");
			pegawaiRepository.save(pegawai);

			pegawai = new Pegawai();
			pegawai.setNama("Muhammad Fatih");
			pegawai.setAlamat("Jakarta");
			pegawaiRepository.save(pegawai);

			pegawai = new Pegawai();
			pegawai.setNama("Abdurrahman Zurafa");
			pegawai.setAlamat("Jakarta");
			pegawaiRepository.save(pegawai);
		};
	}

}

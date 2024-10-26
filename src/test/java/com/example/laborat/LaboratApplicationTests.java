package com.example.laborat;

import com.example.laborat.Entite.Laboratoire;
import com.example.laborat.service.LaboratoireService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class LaboratApplicationTests {

	@Autowired
	private LaboratoireService service = new LaboratoireService();

	@Test
	void testAjouterLaboratoire() {
		// Arrange

		Laboratoire laboratoire = new Laboratoire("Laboratoire A", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcScKzDL-UooaUL_TEbEGcgu3yaXV-9AV8e81foeGdxMsPd-ipl_kIdh81TpzwxJVF4BB4s&usqp=CAU", "NRC123456", true, LocalDate.of(2024, 10, 18));

		// Act
		service.save(laboratoire);

		// Assert
		assertNotNull(service.findAll());
	}
}

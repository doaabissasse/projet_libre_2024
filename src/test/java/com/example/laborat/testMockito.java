package com.example.laborat;

import com.example.laborat.Entite.Laboratoire;
import com.example.laborat.repository.LaboratoireRepository;
import com.example.laborat.service.LaboratoireService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class testMockito {

    @Test
    void testAjouterLaboratoireAvecMock() {
        // Arrange
        LaboratoireRepository mockRepository = mock(LaboratoireRepository.class);
        LaboratoireService service = new LaboratoireService(mockRepository);
        Laboratoire laboratoire = new Laboratoire("labo2","Laboratoire B", "lien_du_logo", "NRC123456", true, LocalDate.of(2024, 10, 18));

        // Act
        service.save(laboratoire);

        // Assert
        verify(mockRepository).save(laboratoire);
    }
}

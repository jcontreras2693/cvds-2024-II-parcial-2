package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.AnaDuran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaDuranRepository extends JpaRepository<AnaDuran, String> {
    public List<AnaDuran> findByPregunta(String pregunta);
}
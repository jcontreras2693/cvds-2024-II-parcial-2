package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.JuanContreras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuanContrerasRepository extends JpaRepository<JuanContreras, String> {
    public List<JuanContreras> findByNumero(int numero);

}
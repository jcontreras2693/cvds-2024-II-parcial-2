package co.edu.eci.cvds.repository;
import co.edu.eci.cvds.model.johanEstrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JohanEstradaRepository extends JpaRepository<johanEstrada, String> {
}

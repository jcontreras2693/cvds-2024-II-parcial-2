package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.model.JuanContreras;
import co.edu.eci.cvds.repository.JuanContrerasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuanContrerasService {
    private final JuanContrerasRepository juanContrerasRepository;

    @Autowired
    public JuanContrerasService(JuanContrerasRepository juanContrerasRepository) {
        this.juanContrerasRepository = juanContrerasRepository;
    }

    public JuanContreras getJuanContreras(int numero) {
        return juanContrerasRepository.findByNumero(numero).get(1);
    }
    public List<JuanContreras> getAllJuanContreras() {
        return juanContrerasRepository.findAll();
    }
}

package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.johanEstrada;
import co.edu.eci.cvds.repository.JohanEstradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JohanEstradaService {
    private final JohanEstradaRepository johanRepository;

    @Autowired
    public JohanEstradaService(JohanEstradaRepository johanRepository) {
        this.johanRepository = johanRepository;
    }
    public List<johanEstrada> getAllJohanEstrada(){
        return johanRepository.findAll();
    }
}

package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.AnaDuran;
import co.edu.eci.cvds.repository.AnaDuranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnaDuranService {
    private final AnaDuranRepository anaDuranRepository;

    @Autowired
    public AnaDuranService(AnaDuranRepository anaDuranRepository) {
        this.anaDuranRepository = anaDuranRepository;
    }


    public AnaDuran addAnaDuran(AnaDuran anaDuran) {
        return anaDuranRepository.save(anaDuran);
    }

    public AnaDuran getAnaDuran(String pregunta) {
        return anaDuranRepository.findByPregunta(pregunta).get(1);
    }

    public List<AnaDuran> getAllAnaDuran() {
        return anaDuranRepository.findAll();
    }

    public AnaDuran updateAnaDuran(AnaDuran anaDuran) {
        if (anaDuranRepository.findByPregunta(anaDuran.getPregunta()).size() == 0) {
            return anaDuranRepository.save(anaDuran);
        }

        return null;
    }

    public void deleteAnaDuran(String propiedad) {
        anaDuranRepository.deleteById(propiedad);
    }

    public String getPremio() {
        return anaDuranRepository.findByPregunta("premio").get(0).getRespuesta();
    }
}
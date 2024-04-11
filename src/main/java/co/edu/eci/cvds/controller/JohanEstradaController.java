package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.johanEstrada;
import co.edu.eci.cvds.service.JohanEstradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/johanestrada")
public class JohanEstradaController {

    private final JohanEstradaService johanEstradaService;

    @Autowired
    public JohanEstradaController(JohanEstradaService johanEstradaService) {
        this.johanEstradaService = johanEstradaService;
    }

    @GetMapping("/example/api/configurations")
    @ResponseBody
    public List<johanEstrada> exampleApiConfigurations() {
        return johanEstradaService.getAllJohanEstrada();
    }

    @GetMapping("/example")
    public String example(Model model) {
        return "example";
    }

    @GetMapping("/example/api")
    public String exampleApi() {
        return "johan_estrada";
    }

}

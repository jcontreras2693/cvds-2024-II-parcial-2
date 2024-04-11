package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.model.JuanContreras;
import co.edu.eci.cvds.service.JuanContrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/juanContreras")
public class JuanContrerasController {

    private final JuanContrerasService juanContrerasService;

    @Autowired
    public JuanContrerasController(JuanContrerasService juanContrerasService) {
        this.juanContrerasService = juanContrerasService;
    }

    @GetMapping("/example/api/configurations")
    @ResponseBody
    public List<JuanContreras> exampleApiConfigurations() {
        return juanContrerasService.getAllJuanContreras();
    }

    @GetMapping("/example/api")
    public String example(Model model) {
        List<JuanContreras> juan = juanContrerasService.getAllJuanContreras();
        model.addAttribute("juan", juan);
        return "juanContreras";
    }
}

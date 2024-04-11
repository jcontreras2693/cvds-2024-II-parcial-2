package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.AnaDuran;
import co.edu.eci.cvds.service.AnaDuranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/anaDuran")
public class AnaDuranController {

    private final AnaDuranService anaDuranService;

    @Autowired
    public AnaDuranController(AnaDuranService anaDuranService) {
        this.anaDuranService = anaDuranService;
    }
    @GetMapping("/example/api")
    public String example(Model model) {
        List<AnaDuran> anaDuranList = anaDuranService.getAllAnaDuran();
        model.addAttribute("anaDuranList", anaDuranList);
        return "anaDuran";
    }

//    @GetMapping("/example/api")
//    public String exampleApi() {
//        return "anaDuran";
//    }

    @GetMapping("/example/api/configurations")
    @ResponseBody
    public List<AnaDuran> exampleApiAnaDuran() {
        return anaDuranService.getAllAnaDuran();
    }
}

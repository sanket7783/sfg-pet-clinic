package pet.clinic.sg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String index() {
        return "vet/index";
    }
}
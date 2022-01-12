package pet.clinic.sg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class petController {

    @RequestMapping({"/pets","/pets/index","/pets/index.html"})
    public String listPets() {
        return "pet/index";
    }
}

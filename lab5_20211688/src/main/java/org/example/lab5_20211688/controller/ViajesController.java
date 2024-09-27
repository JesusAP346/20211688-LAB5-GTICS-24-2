package org.example.lab5_20211688.controller;

import org.example.lab5_20211688.entity.Viajes;
import org.example.lab5_20211688.repository.ViajesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;



@Controller
public class ViajesController {
    private final ViajesRepository viajesRepository;

    public ViajesController(ViajesRepository viajesRepository) {
        this.viajesRepository = viajesRepository;
    }

    @GetMapping({"/","/inicio","/home",""})
    public String irInicio(){
        return "inicio";
    }
    @GetMapping({"/viajes",})
    public String mostrarViajes(Model model){
            List<Viajes> listaViajes = viajesRepository.findAll();
            model.addAttribute("listaViajes",listaViajes);



        return "viajesLista";
    }
}

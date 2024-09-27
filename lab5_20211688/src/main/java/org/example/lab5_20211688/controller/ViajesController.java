package org.example.lab5_20211688.controller;

import org.example.lab5_20211688.entity.Lugares;
import org.example.lab5_20211688.entity.Persona;
import org.example.lab5_20211688.entity.Viajes;
import org.example.lab5_20211688.repository.LugaresRepository;
import org.example.lab5_20211688.repository.PersonaRepository;
import org.example.lab5_20211688.repository.ViajesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;



@Controller
public class ViajesController {
    private final ViajesRepository viajesRepository;
    private final PersonaRepository personaRepository;
    private final LugaresRepository lugaresRepository;

    public ViajesController(LugaresRepository lugaresRepository, PersonaRepository personaRepository, ViajesRepository viajesRepository) {
        this.lugaresRepository = lugaresRepository;
        this.personaRepository = personaRepository;
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
    @GetMapping({"/nuevoViaje",})
    public String crearViaje(Model model){
        List<Persona> listaPersonas = personaRepository.findAll();
        List<Lugares> listaLugares = lugaresRepository.findAll();
        model.addAttribute("listaPersonas",listaPersonas);
        model.addAttribute("listaLugares",listaLugares);

        return "formularioViaje";
    }
    @PostMapping("/formularioPost")
    public String crearViaje(Viajes viajes){
        System.out.println(viajes.getPunto_recojo());
        System.out.println(viajes.getCant_personas());
        System.out.println(viajes.getCant_perros());
        System.out.println(viajes.getIdPersona());
        System.out.println(viajes.getIdLugares());



        viajesRepository.save(viajes);
        return "redirect:/viajes";
    }
}

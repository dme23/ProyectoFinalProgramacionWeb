package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class ocupaciones {
    /*
    Este metodo responde a ocupciones
    EJEM: hhtp://locahost:8080/ocupaciones.html
    */
    
    @RequestMapping(value="/ocupaciones.html", method=RequestMethod.GET)
    public String ocupacion(Model model, HttpSession session){
        return "ocupaciones";
    }
}
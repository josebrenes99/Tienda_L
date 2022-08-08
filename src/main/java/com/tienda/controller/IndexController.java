/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

/**
 *
 * @author Jose Ignacio
 */
import com.tienda.domain.Cliente;
import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tienda.service.ClienteService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private ArticuloService articuloService;
    @GetMapping("/")
    public String Inicio(Model model) {
        log.info("Ahora utilizamos MVC");

        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
       
        
        return "index";
    }

}
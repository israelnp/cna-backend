package com.nelioalves.cursomc.resources;

import com.nelioalves.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria cat01 = new Categoria(1, "Informática");
        Categoria cat02 = new Categoria(2, "Escritório");

        return List.of(cat01, cat02);
    }
}

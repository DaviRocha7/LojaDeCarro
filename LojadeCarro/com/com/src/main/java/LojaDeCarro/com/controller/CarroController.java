package LojaDeCarro.com.controller;


import LojaDeCarro.com.model.Carro;
import LojaDeCarro.com.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service){
        this.service = service;
    }

    @GetMapping
    public List<Carro> lista(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Carro buscar(@PathVariable Long id){
        return service.buscar(id);
    }

    @PostMapping
    public Carro criar(@RequestBody Carro carro){
        return service.salvar(carro);
    }
}

package library.mslibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import library.mslibrary.service.CalculadoraService;

@RestController
@RequestMapping({"calculadora"})
public class CalculadoraController {
    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("")
    public String get()
    {
        return "Soy una calculadora";
    }

    @GetMapping("/suma")
    public String suma(@RequestParam int op1, @RequestParam int op2 )
    {
        return "Resultado con service:"+calculadoraService.suma(op1,op2);
    }

    @GetMapping("/resta")
    public String resta(@RequestParam int op1, @RequestParam int op2 )
    {
        return "Resultado con service:"+calculadoraService.resta(op1,op2);
    }

    @GetMapping("/multiplica")
    public String multiplica(@RequestParam int op1, @RequestParam int op2 )
    {
        return "Resultado con service:"+calculadoraService.multiplica(op1,op2);
    }

    @GetMapping("/division")
    public String division(@RequestParam int op1, @RequestParam int op2 )
    {
        return "Resultado con service:"+calculadoraService.division(op1,op2);
    }
}

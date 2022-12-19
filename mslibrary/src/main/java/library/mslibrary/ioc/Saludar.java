package library.mslibrary.ioc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saludar {
    @Autowired
    private Saludo saludo;

    public Saludar() {
        System.out.println("Saludar ha sido creado");
    }

    @PostConstruct
    public void saluda() {
        System.out.println(saludo.obtenSaludo());
    }
}
package library.mslibrary.ioc;

import org.springframework.stereotype.Component;

// @Component
public class SaludoIngles implements Saludo{

    @Override
    public String obtenSaludo() {
        return "Hello, How are U?";
    }
    
}

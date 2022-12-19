package library.mslibrary.ioc;

import org.springframework.stereotype.Component;

@Component
public class SaludoEspa implements Saludo {

    @Override
    public String obtenSaludo() {
        return "Hello, its me";
    }

}

package library.mslibrary.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int suma(int op1, int op2)
    {
        return op1+op2;
    }

    public int resta(int op1, int op2)
    {
        return op1-op2;
    }

    public int multiplica(int op1, int op2)
    {
        return op1*op2;
    }

    public int division(int op1, int op2)
    {
        return op1/op2;
    }
}

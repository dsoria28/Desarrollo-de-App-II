package mx.edu.utng.dsoria.calculadora;

/**
 * Created by UTNG on 25/09/2017.
 */

public class CalculadoraNormal implements AbstractCalculadora{
    @Override
    public double sumar(double n1, double n2) {
        return n1+n2;
    }
    @Override
    public double restar(double n1, double n2) {
        return n1-n2;
    }
    public double multiplicar(double n1, double n2) {
        return n1*n2;
    }
    public double dividir(double n1, double n2) {
        return n1/n2;
    }

}

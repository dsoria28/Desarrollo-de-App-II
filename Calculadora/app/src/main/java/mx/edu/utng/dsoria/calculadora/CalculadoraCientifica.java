package mx.edu.utng.dsoria.calculadora;

/**
 * Created by UTNG on 25/09/2017.
 */

public class CalculadoraCientifica implements AbstractCalculadora {
    @Override
    public double sumar(double n1, double n2) {
        return n1+n2;
    }

    @Override
    public double restar(double n1, double n2) {
        return n1-n2;
    }

    public int factorial(int n1) {
        int factorial=1;
        for (int i=1;i<=n1;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}

package mx.edu.utng.dsoria.telefoniastrategy;

/**
 * Created by wm on 29/09/2017.
 */

public class Contexto {
    private Telefonica strategy;
    public Contexto(Telefonica strategy){
        this.strategy=strategy;
    }

    public double calcularTarifaLocal(int minutosLocal){
        return strategy.calcularTarifaLocal(minutosLocal);
    }

    public double calcularTarifaLD(int minutosLD){
        return strategy.calcularTarifaLD(minutosLD);
    }
}

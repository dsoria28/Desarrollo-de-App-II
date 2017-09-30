package mx.edu.utng.dsoria.telefoniastrategy;

/**
 * Created by wm on 29/09/2017.
 */

public class Telcel implements Telefonica {
    @Override
    public double calcularTarifaLocal(int minutosLocal) {
        return  minutosLocal*2.0;
    }

    @Override
    public double calcularTarifaLD(int minutosLD) {
        return minutosLD*5.0;
    }
}

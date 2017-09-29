package mx.edu.utng.dsoria.apppuzzle;

/**
 * Created by UTNG on 27/09/2017.
 */

public interface PuzzleEstrategia {
    public void moverPieza(int pos1,int pos2);
    public boolean verificarMov(int pos);
    public boolean yaGano();
}

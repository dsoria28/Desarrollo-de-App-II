package mx.edu.utng.dsoria.menus;

/**
 * Created by wm on 29/09/2017.
 */

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }


    public String getDescription(){
        throw new UnsupportedOperationException();
    }


    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public String print(){
        throw new UnsupportedOperationException();

    }


}

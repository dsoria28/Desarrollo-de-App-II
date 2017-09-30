package mx.edu.utng.dsoria.menus;

/**
 * Created by wm on 29/09/2017.
 */

public class Waitress { //Camarero
    MenuComponent allMenus;

    public Waitress (MenuComponent allMenus){
        this.allMenus= allMenus;
    }
    public String printMenu(){
        return allMenus.print();
    }

}
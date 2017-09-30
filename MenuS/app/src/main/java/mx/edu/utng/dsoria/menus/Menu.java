package mx.edu.utng.dsoria.menus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wm on 29/09/2017.
 */


public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    String description;

    public Menu(String name, String description){
        this.name= name;
        this.description= description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);

    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    public String print(){
        String lista = "";
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            lista += menuComponent.print();
        }

        return "\n"+getName()+"\n"+getDescription()+
                "\n--------------------------------\n"+
                lista;
    }
}

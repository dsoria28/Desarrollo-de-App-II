package mx.edu.utng.dsoria.menus;

/**
 * Created by wm on 29/09/2017.
 */


public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price= price;


    }
    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
    public String print(){
        String v;
        if(isVegetarian()){
            v= "vegetariano";
        }else{
            v = "Normal";
        }
        return getName()+"\n"+
                getDescription()+"\n"+
                v+"\n"+
                getPrice()+
                "\n"+"\n";
    }

}

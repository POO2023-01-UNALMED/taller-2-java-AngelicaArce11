package test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
    if (color=="rojo" || color=="verde"|| color=="amarillo" || color=="negro" || color=="blanco"){
        this.color=color;
        }  
    }   
}   
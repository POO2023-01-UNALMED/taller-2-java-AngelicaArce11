package test;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        int cantiAsientos=0;
        for(int i=0; i<asientos.length;i++){
            if (asientos[i]!=null){
                cantiAsientos++;
            }
        }
        return cantiAsientos;
    }

    public String verificarIntegridad(){
        if (motor.registro==this.registro){  
            for(int i=0; i<asientos.length;i++){
                if (asientos[i]!=null){
                    if (asientos[i].registro!=motor.registro){
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }else{
            return "Las piezas no son originales";
        }
    }
}
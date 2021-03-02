/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqCoche;

/**
 *
 * @author alumno2
 */
public class Coche {
    private int puertas;
    private String cambio, combustible;
    private final static String[] tipo={"DIESEL","GASOLINA","ELECTRICO"};

    public int getPuertas() {

       return this.puertas;
    }

    public String getCambio() {
        return this.cambio;
    }

    public String getCombustible() {
        return this.combustible;
    }

    public void setPuertas(int puertas) throws IllegalArgumentException{
       
            if (puertas<3 || puertas>5) 
        {
            throw new IllegalArgumentException ("Número de puertas erróneo.");
        }
            else this.puertas= puertas;
    }

    public void setCambio(String cambio) throws IllegalArgumentException{
        String nvCambio=cambio.trim().toUpperCase();
        if (nvCambio.equals("MANUAL") || nvCambio.equals("AUTOMATICO")){
            this.cambio = cambio;
        }
        else
            throw new IllegalArgumentException ("Cambio no reconocido.");
    }

    public void setCombustible(String combustible) throws IllegalArgumentException {
        String nvCombustible=combustible.trim().toUpperCase();
        boolean encontrado=false;
        for (int i = 0; i < Coche.tipo.length; i++) {
            if (nvCombustible==Coche.tipo[i]) {
                encontrado=true;
                break;
            }
        }
        /*if (!nvCombustible.equals("DIESEL") && !nvCombustible.equals("ELECTRICO") && !nvCombustible.equals("GASOLINA")){
            throw new IllegalArgumentException ("Combustible no reconocido.");
        }
        else*/
            this.combustible = combustible;
    }

    public Coche(int puertas, String cambio, String combustible) {
        this.puertas = puertas;
        this.cambio = cambio;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Coche{" + "puertas=" + this.puertas + ", cambio=" + this.cambio + ", combustible=" + this.combustible + '}';
    }
    
    
    
}

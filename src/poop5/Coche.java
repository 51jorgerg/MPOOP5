/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Jorge Rodriguez
 * Clase coche con capacidad de hasta 4 personas
 */
public class Coche {
    //Atributos
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    /**
     * Constructor vacio
     */
    public Coche(){
        chofer = new Persona();
        copiloto = new Persona();
        pasajero1 = new Persona();
        pasajero2 = new Persona();
    }
    
    /**
     * Constructor lleno
     * @param chofer
     * @param copiloto
     * @param pasajero1
     * @param pasajero2 
     */
    public Coche(Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    
    /**
     * Metodo que establece al chofer del coche
     * @param chofer 
     */
    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }	
    
    /**
     * Metodo que devuelve al chofer del coche
     * @return chofer
     */
    public Persona getChofer() {
        return chofer;
    }
    
    /**
     * Metodo que establece al copiloto del coche
     * @param copiloto 
     */
    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }	
    
    /**
     * Metodo que devuelve al copiloto del coche
     * @return copiloto
     */
    public Persona getCopiloto() {
        return copiloto;
    }
    
    /**
     * Metodo que establece al Pasajero 1 del coche
     * @param pasajero1 
     */
    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }	
    
    /**
     * Metodo que devuelve al Pasajero 2 del coche
     * @return pasajero 1
     */
    public Persona getPasajero1() {
        return pasajero1;
    }
    
    /**
     * Metodo que establece al Pasajero 2 del coche
     * @param pasajero2 
     */
    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }	
    
    /**
     * Metodo que devuelve al Pasajero 2 del coche
     * @return pasajero 2
     */
    public Persona getPasajero2() {
        return pasajero2;
    }
    
    /**
     * Metodo que parsea un objeto a una cadena 
     * @return ocupantes del coche
     */
    @Override
    public String toString(){
        return ("Chofer: " + chofer.getNombre() + " Copiloto: " + copiloto.getNombre() + " Pasajero 1: " + pasajero1.getNombre() + " Pasajero 2: " + pasajero2.getNombre());
    }
}

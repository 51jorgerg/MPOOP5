/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Jorge Rodríguez
 * Clase persona
 */
public class Persona {
    //Atributos
	private int edad;
	private float altura;
	private String nombre;
	private Fecha fechaDeNacimiento;
	private String ocupacion;
    /**
     * Constructor vacio
     */
    public Persona() {
	edad = 0;
	altura = 0.0f;
        fechaDeNacimiento = new Fecha();
	nombre = null;
	ocupacion = null;
    }
    
    /**
     * Constructor lleno
     * @param edad
     * @param altura
     * @param nombre
     * @param fechaDeNacimiento
     * @param ocupacion 
     */
    public Persona(int edad, float altura, String nombre, Fecha fechaDeNacimiento, String ocupacion){
	this.edad = edad;
	this.altura = altura;
        this.fechaDeNacimiento = fechaDeNacimiento;
	this.nombre = nombre;
	this.ocupacion = ocupacion;
    }
    
    /**
     * Metodo que establece la edad
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }	
    
    /**
     * Metodo que devuelve la edad
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Metodo que establece la altura
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Metodo que devuelve la altura
     * @return altura
     */
    public float getAltura() {
        return altura;
    }
    
    /**
     * Metodo que establece
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que establece la fecha de nacimiento
     * @param fechaDeNacimiento 
     */
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    /**
     * Metodo que devuelve la fecha de nacimiento
     * @return fecha de nacimiento
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento.toString();
    }
    
    /**
     * Metodo que establece la ocupacion
     * @param ocupacion 
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    /**
     * Metodo que devuelve la ocupación
     * @return ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }
    
    /**
     * Metodo que parsea un objeto a una cadena
     * @return atributos del objeto en una cadena
     */
    @Override
    public String toString(){
        return ("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura + " Fecha de nacimiento: " + fechaDeNacimiento + " Ocupacion: " + ocupacion);
    }
    
}

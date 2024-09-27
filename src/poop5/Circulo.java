package poop5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Rodriguez
 * Clase circulo
 */
public class Circulo {
    //Atributos
    final float PI = 3.14f;
    private float radio;
    
    /**
     * Constructor vacío
     */
    public Circulo(){
        this.radio = 0.0f;
    }
    
    /**
     * Constructor lleno
     * @param radio 
     */
    public Circulo(float radio){
        this.radio = radio;
    }
    
    /**
     * Método que devuelve el radio del circulo
     * @return radio
     */
    public float getRadio(){
        return this.radio;
    }
    
    /**
     * Metodo que establece el radio del circulo
     * @param radio
     */
    public void setRadio(float radio){
        this.radio = radio;
    }
    
    /**
     * Método que calcula el perímetro del círculo
     */
    public void calcPerimetro(){
        float perimetro = 2 * radio * PI;
        System.out.println("Perimetro = " + perimetro);
    }
    
    /**
     * Método que calcula el área del círculo
     */
    public void calcArea(){
        float area = PI * (radio * radio);
        System.out.println("Area = " + area);
    }
    
    /**
     * Método que parsea un objeto a una cadena
     * @return atributos como una cadena
     */
    @Override
    public String toString() {
        return "Circulo{" + "PI=" + PI + ", radio=" + radio + '}';
    }
}

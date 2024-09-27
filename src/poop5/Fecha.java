/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Jorge Rodriguez
 * Clase Fecha formato dd/mm/aaaa
 */
public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    /**
     * Constructor vacío
     */
    public Fecha(){
    }
    /**
     * Constructor lleno
     * @param dia Día en que nació una persona
     * @param mes Mes en que nació una persona
     * @param anio Año en que nació una persona
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * Metodo que devuelve el día
     * @return dia
     */
    public int getDia(){
        return dia;
    }
    /**
     * Metodo que establece el día
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Metodo que devuelve el mes
     * @return mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * Metodo que establece el mes
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * Metodo que devuelve el año
     * @return anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Metodo que establece el año de nacimiento de una persona
     * @param anio Año de nacimiento
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Metodo que imprime la fecha con el formato: dia/mes/año
     * @return Una cadena con el formato dia/mes/año
     */
    public String imprimirFecha() {
        System.out.println(dia+"/"+mes+"/"+anio);
        return (dia+"/"+mes+"/"+anio);
    }
    /**
     * Metodo que parsea un objeto a una cadena
     * @return Los atributos de Fecha en una cadena
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}

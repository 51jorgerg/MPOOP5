/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Jorge Rodriguz
 */
public class POOP5{ 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("####Circulo####");
        //inicializando circulo
        Circulo circulo = new Circulo();
        
        System.out.println(circulo.getRadio());
        //Imprime 0 usando el costructor vacio
        
        //establece un nuevo radio
        circulo.setRadio(7.77f);
        
        circulo.calcArea();
        
        circulo.calcPerimetro();
        
        
        System.out.println("####Persona####");
        
        
        //inicializando una Persona con el constructor vacio
        Persona persona1 = new Persona();
        
        //establecer valores de la persona
        persona1.setEdad(19);
        persona1.setAltura(1.69f);
        persona1.setNombre("Jorge");
        
        //Inicializando la fecha
        Fecha fechaDeNacimiento = new Fecha();
        //establecer valores de la fecha
        fechaDeNacimiento.setDia(30);
        fechaDeNacimiento.setMes(8);
        fechaDeNacimiento.setAnio(2005);
        
        //asignando fecha a la persona
        persona1.setFechaDeNacimiento(fechaDeNacimiento);
        persona1.setOcupacion("Estudiante");
        
        //imprimir los atributos de la persona
        System.out.println(persona1);
        
        //imprimir fecha usando el metodo
        System.out.println("####Fecha####");
        fechaDeNacimiento.imprimirFecha();
        
        System.out.println("####Coche####");
        //inicializando el coche
        Coche coche = new Coche();
        //asignar el lugar del chofer
        coche.setChofer(persona1);

        // Mostrar los ocupantes y sus lugares
        //como las demas posciciones no tienen personas asignadas seran null
        System.out.println(coche);
       
    }
    
}

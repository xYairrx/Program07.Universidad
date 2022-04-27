/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program06.universidad;

/**
 *
 * @author Yair
 */
public class Program06Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante(8200065, "Yair", "Almanza", "Guzmán", "AAGY010930HMCLZRA2", "30/09/01", "Ixtlahuaca", 20);
        
        Asignatura asignatura1 = new Asignatura();
        Asignatura asignatura2 = new Asignatura("ADE124", "Programación II", 4, 8);
        
        Maestro maestro1 = new Maestro();
        Maestro maestro2 = new Maestro("Ismael");
        
        
    }
    
}

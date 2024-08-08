/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolegiado;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class EjercicioColegiado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        byte opc=0;
        
         while(opc!=3){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***MENÚ PRINCIPAL***\n\n"
                         + "1.Agregar Estudiante\n"
                         + "2.Mostrar notas y Resultados\n"
                         + "3.Salir\n"
                         + "Digite su opción:"));
         switch(opc){
             case 1:{
               
               agregarEstudiantes();
                break;
             } 
             case 2:{
               mostrarNotas(); 
               mostrarResultados();
              
                break;
             }
             case 3:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
        
            
        }
    
        private static Estudiantes ArrayEstudiantes[] = new Estudiantes[10];
        
        public static void agregarEstudiantes(){
    
        
            for (int x = 0; x < 10; x++) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del estudiante:"));
                estudiante.setCurso(JOptionPane.showInputDialog(null, "Digite el nombre del curso:"));
                estudiante.setProfesor(JOptionPane.showInputDialog(null, "Digite el nombre del profesor:"));
                estudiante.setCalificacion(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la calificación del estudiantes:")));
                ArrayEstudiantes[x] = estudiante;
            }
        
        }
        
        public static void mostrarNotas() {
        for (int i = 0; i < 10; i++) {
                JOptionPane.showMessageDialog(null, ArrayEstudiantes[i].getNombre() + " " + ArrayEstudiantes[i].getCurso() + " " + ArrayEstudiantes[i].getProfesor()+" " + ArrayEstudiantes[i].getCalificacion());
            }
    }
        
        public static void mostrarResultados() {
        double acumuladorNotas = 0;
        double promedioNotas=0;
        double notaMayor=0;
        String estudianteNotaMayor="";
        double notaMenor=100;
        String estudianteNotaMenor="";
        int cantidadMayorPromedio=0;
        int cantidadMenorPromedio=0;
        
        for (int i = 0; i < 10; i++) {
            acumuladorNotas = acumuladorNotas + ArrayEstudiantes[i].getCalificacion();
            promedioNotas=acumuladorNotas/10;
            if (ArrayEstudiantes[i].getCalificacion() > notaMayor) {
                    notaMayor=ArrayEstudiantes[i].getCalificacion();
                    
            }
            if (ArrayEstudiantes[i].getCalificacion() < notaMenor) {
                    notaMenor=ArrayEstudiantes[i].getCalificacion();
                    
            }
            
            if (ArrayEstudiantes[i].getCalificacion() < promedioNotas) {
                    cantidadMayorPromedio=cantidadMayorPromedio+1;
                    
            }
            cantidadMenorPromedio=10-cantidadMayorPromedio;
        }
        JOptionPane.showMessageDialog(null, "La suma total de las notas es:" + acumuladorNotas);
        JOptionPane.showMessageDialog(null, "El promedio total de las notas es:" + promedioNotas);
        JOptionPane.showMessageDialog(null, "La nota mayor es:" + notaMayor);
        JOptionPane.showMessageDialog(null, "La nota menor es:" + notaMenor);
        JOptionPane.showMessageDialog(null, "Cantidad de estudiantes con una nota mayor al promedio es:" + cantidadMayorPromedio);
        JOptionPane.showMessageDialog(null, "Cantidad de estudiantes con una nota mayor al promedio es:" + cantidadMenorPromedio);
}
        
}
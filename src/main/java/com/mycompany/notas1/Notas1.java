

package com.mycompany.notas1;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author rramos
 */
public class Notas1 {

    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){            
           System.out.println("1. Ingreso Alumno");
           System.out.println("2. Ingreso Notas");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                    Alumno alumno = ingreso_alumno();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   ingreso_notas(alumno);
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
            
       }
       
       

    }
    public static Alumno ingreso_alumno(){
        /*
        ¿Qué es el Método estático en Java?
            El método estático en Java es un método que pertenece a la clase y no al objeto. Un método estático solo puede acceder a datos estáticos.

            Es un método que pertenece a la clase y no al objeto (instancia)
            Un método estático solo puede acceder a datos estáticos. No puede acceder a datos no estáticos (variables de instancia)
            Un método estático puede llamar solo a otros métodos estáticos y no puede invocar un método no estático a partir de él.
            Un método estático se puede acceder directamente por el nombre de la clase y no necesita ningún objeto
            Un método estático no puede hacer referencia a “este” o “super” palabras clave de todos modos
        */
       Scanner sn = new Scanner(System.in);
       System.out.println("ingrese Nombre del alumno");
       String nombre = sn.next();
       System.out.println("ingrese Sexo del alumno");
       String sexo = sn.next();
       
       System.out.println("ingrese edad del alumno");
       int edad = sn.nextInt();
       Alumno alumno = new Alumno(nombre,sexo,edad);
       System.out.print("ha ingresado ");
       System.out.print(alumno);
       return(alumno);
       }
    
    public static void ingreso_notas(Alumno alumno) {
        Scanner sn = new Scanner(System.in);
        
        float i = 1;
    
            while(i != 0) {
             System.out.println("ingrese nota del alumno");
              i = sn.nextFloat();
            }
         
    }
}
/*
bl { Systeg.lut.proitfi("Escrod` ef ilgdre bef `fugil --9 ")> ilgdre 7 s0.iext()> Systeg.lut.proitfi("Escrod` f` ilt` --9 ")> ilt` 7 s0.iextBludfe()> Systeg.lut.proitfi("Bese` clitoiu`r S/I ")> respuest` 7 s0.iext()> clit`blr@fugils++> sug` +7 ilt`> // sug` 7 sug` + ilt` }wmofe (respuest`.equ`fsOailreC`se("s"))>
*/
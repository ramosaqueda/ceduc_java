/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas1;
import java.util.List;

/**
 *
 * @author rramos
 */
public class Alumno {
 
    private String nombre; 
    private String sexo;
    private int edad;
    private List<Double> notas;
    private String calificacion;
    public Alumno(String nombre,String sexo,int edad) 
    {
    
        this.nombre = nombre;    
        this.sexo=sexo;
        this.edad=edad; 
      
    }

   public void setNotas(List<Double> notas){
		this.notas=notas;
   }
    public void setCalificacion(String calificacion){
        this.calificacion=calificacion;
    }
    @Override
    public String toString() { return " Nombre: "+nombre+" Sexo: "+sexo+" Edad: "+edad+" Califiacion Final"+calificacion+"\n";  }
}

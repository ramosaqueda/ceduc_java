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
    public Alumno() 
    {
        super();
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

   public void setNotas(List<Double> notas){
		this.notas=notas;
   }
    public void setCalificacion(String calificacion){
        this.calificacion=calificacion;
    }
    @Override
    public String toString() { return " Nombre: "+getNombre()+" Sexo: "+getSexo()+" Edad: "+getEdad()+" Califiacion Final"+calificacion+"\n";  }
}

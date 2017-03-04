/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import sun.security.util.Length;

/**
 *
 * @author anunez12
 */
public class Palabra {

    private String nombre;
    private String significado;
    private ArrayList<String> sinonimos = new ArrayList<String>();

    public Palabra(String nombre, String significado) {
        this.nombre = nombre;
        this.significado = significado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public ArrayList<String> getSinonimos() {
        return sinonimos;
    }

    public void setSinonimos(ArrayList<String> sinonimos) {
        this.sinonimos = sinonimos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.significado);
        hash = 71 * hash + Objects.hashCode(this.sinonimos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Palabra other = (Palabra) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Palabra{" + "nombre=" + nombre + ", significado=" + significado + ", sinonimos=" + sinonimos + '}';
    }

    public void adiccionar_sinonimo(String sinonimo) {
        sinonimos.add(sinonimo);
    }

    public boolean buscar_palabra(String sinonimo) {
        return sinonimos.contains(sinonimo);
    }

    public boolean eliminar_nota(String sinonimo) {
        return sinonimos.remove(sinonimo);
    }

    public double promedio() {

        double suma = 0;
        for (int i = 0; i < sinonimos.size(); i++) {
            String actual = sinonimos.get(i);
            suma += actual.length();
        }
        return suma / sinonimos.size();
    }

    public double mayor() {

        int mayor = sinonimos.get(0).length();
        for (int i = 0; i < this.sinonimos.size(); i++) {
            String actual = sinonimos.get(i);
            if (actual.length() > mayor) {
                mayor = actual.length();

            }

        } 
        return mayor;       
        
    } 
    public double menor() {

        int menor = sinonimos.get(0).length();
        for (int i = 0; i < this.sinonimos.size(); i++) {
            String actual = sinonimos.get(i);
            if (actual.length() < menor) {
                menor = actual.length();

            }

        } 
        return menor;         
        
    } 
    public double letra(){ 
     
     int cont = 1;
     int letradada = sinonimos.indexOf(0);
     
        for (int i = 0; i < sinonimos.indexOf(i); i++) { 
          String actual = sinonimos.get(i);
           if(actual.indexOf(i) == letradada){ 
            cont ++;
           }
          
            
        } 
        return cont;            
    }
  

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import clases.Palabra;

/**
 *
 * @author anunez12
 */
public class Sinonimos {

    public static void main(String[] args) {

        Palabra palabra_uno = new Palabra("Leer", " Entender o interpretar un texto de un determinado modo.");

        palabra_uno.adiccionar_sinonimo("Analizar");
        palabra_uno.adiccionar_sinonimo("Identificar");
        palabra_uno.adiccionar_sinonimo("Deducir");
        palabra_uno.adiccionar_sinonimo("Descifrar");
        palabra_uno.adiccionar_sinonimo("Entender");   

        System.out.println(palabra_uno);
        System.out.println("El promedio de la longitud de las palabras dadas es:" + palabra_uno.promedio());  
        System.out.println("La mayor de las palabras dadas es:" + palabra_uno.mayor());   
        System.out.println("La menor de las palabras dadas es:" + palabra_uno.menor());  
        System.out.println("Los sinonimos que inician con una letra dada es " + palabra_uno.letra());     

    }

}

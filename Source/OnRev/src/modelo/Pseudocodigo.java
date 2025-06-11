/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giacomo
 */
public class Pseudocodigo {
    private String contenido;
    private boolean valido;
    
    
    public Pseudocodigo(String texto){
        this.contenido = texto;
        this.valido = false;
    }
    
    
    // ******************************* Métodos *********************************
        
    public boolean validadSintaxis(){
        //TO DO 
        /*
        -usar regex de ser necesario o definir reglas de sintaxis: a liberdad del desarrollador
        -si es válido el valor de this.valido cambia a true; de lo contrario se mantiene el false
        -Respecto a los identados, recomiendo ignorarlos para evitar complicaciones, pero lo dejo a libertad del desarrollador
        */
        return this.valido;
    }
    
    public List<EstructuraControl> extraerExtrucutras(){
        List<EstructuraControl> lista = new ArrayList<>();
        //TO DO
        /*
        -Extrae las estructuras de control encontradas: for, while, if, etc;
        -Estas estructuras deben existir para que sean reconocidas, razón por la cual primero deberán crearse desde el main, 
         de lo contrario no habrá cómo reconocerlas (instanciar 3 objetos de la clase EstructuraControl para que puedan tener
         de dónde guairse para extraer)
        -Retorna la lista de estructuras de control encontradas en el pseudocodigo.
        */
        return lista;        
    }
    
}

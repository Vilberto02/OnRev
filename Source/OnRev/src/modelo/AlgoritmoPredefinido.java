/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;

/**
 *
 * @author Giacomo
 */
public class AlgoritmoPredefinido extends Pseudocodigo{
    private String nombre;
    private Map<Integer, Long> tiemposReales;
    
    public AlgoritmoPredefinido(String nombre, String texto) {
        super(texto);
        this.nombre = nombre;
    }
    
    // ******************************* Métodos *********************************
    
    public Long ejecutarConEntrada(int n){
        //TO DO
        return null;
    }
    
    public ComparacionResultado comparar(FuncionTiempo f){
        //TO DO
        return null;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public boolean validarSintaxis(){
        String[] lineas = contenido.trim().split("\\n+");
        if (lineas.length < 2) return false;

        if (!lineas[0].trim().equalsIgnoreCase("inicio")) return false;
        if (!lineas[lineas.length - 1].trim().equalsIgnoreCase("fin")) return false;

        String[] palabrasClave = {"si", "entonces","mientras", "asignar", "repetir", "segun", "para", "funcion", "escribir", "leer"};
        Set<String> clavesValidas = new HashSet<>(Arrays.asList(palabrasClave));

        for (int i = 1; i < lineas.length - 1; i++) {
            String linea = lineas[i].trim();
            if (!linea.endsWith(";")) return false; // verificar si el profe lo usa asi

            String primerPalabra = linea.split("\\s+")[0].replace(";", "").toLowerCase();
            if (!clavesValidas.contains(primerPalabra) && !esAsignacion(linea)) {
                return false;
            }
        }

        this.valido = true;
        return true;
    }
    
    private boolean esAsignacion(String linea) {
        return linea.matches("[a-zA-Z]\\w*\\s*=.*;");
    }
    
    /**
     * Funcion que extrae de cada línea la estructura de control encontrada
     * @param conocidas (si, para, mientras, etc.)
     * @return 
     */
    public List<EstructuraControl> extraerEstructuras(List<EstructuraControl> conocidas){
        List<EstructuraControl> lista = new ArrayList<>();

        if (!this.valido) return lista;

        String[] lineas = contenido.trim().split("\\n+");

        for (String linea : lineas) {
            for (EstructuraControl estructura : conocidas) {
                String nombre = estructura.getNombre(); 
                if (linea.trim().toLowerCase().startsWith(nombre.toLowerCase())) {
                    lista.add(estructura);
                }
            }
        }
        return lista;        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.itextpdf.awt.geom.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Giacomo
 */
public class FuncionTiempo {
    private String expresion;
    private Map<Integer, Integer> valores;
    
    public FuncionTiempo(String str){
        this.expresion = str;
        
    }
    
    // ******************************* Métodos *********************************
    
    public int evaluar(int n){
        //TO DO
        
        return n;        
    }
    
    
    public List<Point> generarDatosGrafico(){
        List<Point> lista = new ArrayList<>();
        //TO DO
        
        return lista;
        
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public Map<Integer, Integer> getValores() {
        return valores;
    }

    public void setValores(Map<Integer, Integer> valores) {
        this.valores = valores;
    }
    
    
}

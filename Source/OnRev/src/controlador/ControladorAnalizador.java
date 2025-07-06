/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.frmAnalizador;

/**
 *
 * @author Giacomo
 */
public class ControladorAnalizador {
    protected frmAnalizador vista;    
    
    
    public ControladorAnalizador(frmAnalizador vista){
        this.vista = vista;
        
        
        
    }
    
    
    
    public void iniciar(){
       // this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}

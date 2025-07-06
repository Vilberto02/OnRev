/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onrev;

import controlador.ControladorHome;
import vista.frmHome;

/**
 *
 * @author Madrid Ruiz, Giacomo; Pardavé Jara, Asthri; Patricio Julca, Vilberto; Guzmán Romero, Diego; Segura Pacherres, Leonardo.
 */
public class OnRev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorHome contHome = new ControladorHome(new frmHome());
        contHome.iniciar();
        
    }
    
    // No, no entiendo nada, no sé por qué se tiene que hacer así 
}

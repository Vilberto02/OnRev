/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import vista.frmComparador;

/**
 *
 * @author Giacomo
 */
public class ControladorComparador {
    protected frmComparador vista;    
    private ControladorHome vistaHome;
    
    private int posicionX;
    private int posicionY;
    
    
    
    public ControladorComparador(frmComparador vista, ControladorHome vistaHome){
        this.vista = vista;
        this.vistaHome = vistaHome;
        
        this.vista.btnRegresar.setBackground(Color.white);
        this.vista.btnLimpiar.setBackground(Color.white);
        
        this.vista.panTitulo.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent evt) {
                vista.setLocation(evt.getXOnScreen()-posicionX,evt.getYOnScreen()-posicionY);
            }

            @Override
            public void mouseMoved(MouseEvent evt) {                
            }

        });
        
        this.vista.panTitulo.addMouseListener(new MouseAdapter(){           
            @Override
            public void mousePressed(MouseEvent evt) {
                if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
                    posicionX = evt.getX();
                    posicionY = evt.getY();
                    vista.panTitulo.setBackground(new Color(240,240,240)); 
                }    
            }
            
            @Override
            public void mouseReleased(MouseEvent evt) {
                vista.panTitulo.setBackground(Color.white);
            }
            
        });
        
        this.vista.btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                limpiarComponentes();
            }
        });
        
        this.vista.btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                vistaHome.iniciar();
                vista.dispose();
            }
        });
        
        
    }
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    public void limpiarComponentes(){
        this.vista.txtPseudocodigo.setText("");
    }
}

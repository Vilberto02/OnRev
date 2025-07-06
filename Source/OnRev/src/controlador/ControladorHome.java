package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmAnalizador;
import vista.frmHome;

/**
 *
 * @author Giacomo
 */
public class ControladorHome {
    protected frmHome vista;
    private ControladorAnalizador contAnalizador;
    
    public ControladorHome(frmHome vista){
        this.vista = vista;
        this.contAnalizador = new ControladorAnalizador(new frmAnalizador(), this);
        
     
        this.vista.btnAnalizador.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                contAnalizador.iniciar();
                vista.dispose();
            }
        });
        
    }
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}

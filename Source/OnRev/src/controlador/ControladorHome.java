package controlador;

import java.awt.Dimension;
import vista.frmHome;

/**
 *
 * @author Giacomo
 */
public class ControladorHome {
    protected frmHome vista;
    
    public ControladorHome(frmHome vista){
        this.vista = vista;
        
        
        
    }
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}

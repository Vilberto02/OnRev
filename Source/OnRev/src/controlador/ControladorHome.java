package controlador;

import java.awt.Dimension;
import vista.frmHome;

/**
 *
 * @author Giacomo
 */
public class ControladorHome {
    protected frmHome vista;
    //private Dimension tamannoVentana = new Dimension(600,400);
    
    public ControladorHome(frmHome vista){
        this.vista = vista;
        
        
        
    }
    
    
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        //this.vista.setPreferredSize(tamannoVentana );
        //this.vista.setSize(tamannoVentana );
    }
}

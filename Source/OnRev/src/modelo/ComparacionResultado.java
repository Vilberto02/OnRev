package modelo;

import java.util.Map;

/**
 *
 * @author Giacomo
 */
public class ComparacionResultado {
    private FuncionTiempo tiempoTeorico;
    private Map<Integer, Long> tiempoReal ;
    private double diferenciaPorcentual;
    
    // ******************************* Métodos *********************************

    public FuncionTiempo getTiempoTeorico() {
        return tiempoTeorico;
    }

    public void setTiempoTeorico(FuncionTiempo tiempoTeorico) {
        this.tiempoTeorico = tiempoTeorico;
    }

    public Map<Integer, Long> getTiempoReal() {
        return tiempoReal;
    }

    public void setTiempoReal(Map<Integer, Long> tiempoReal) {
        this.tiempoReal = tiempoReal;
    }

    public double getDiferenciaPorcentual() {
        return diferenciaPorcentual;
    }

    public void setDiferenciaPorcentual(double diferenciaPorcentual) {
        this.diferenciaPorcentual = diferenciaPorcentual;
    }
    
    
    
}

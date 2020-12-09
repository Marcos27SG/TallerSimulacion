/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCOS
 */
public class ObjetoReporteSinEspera {
    
    String InventarioInicial , Demanda , InventarioFinal ;
    String Mes, Faltante , Orden ;

    public ObjetoReporteSinEspera(String Mes, String InventarioInicial, String Demanda, String InventarioFinal, String Faltante, String Orden) {
        this.Mes = Mes;
        this.InventarioInicial = InventarioInicial;
        this.Demanda = Demanda;
        this.InventarioFinal = InventarioFinal;
        this.Faltante = Faltante;
        this.Orden = Orden;
    }

    public String getInventarioInicial() {
        return InventarioInicial;
    }

    public void setInventarioInicial(String InventarioInicial) {
        this.InventarioInicial = InventarioInicial;
    }

    public String getDemanda() {
        return Demanda;
    }

    public void setDemanda(String Demanda) {
        this.Demanda = Demanda;
    }

    public String getInventarioFinal() {
        return InventarioFinal;
    }

    public void setInventarioFinal(String InventarioFinal) {
        this.InventarioFinal = InventarioFinal;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getFaltante() {
        return Faltante;
    }

    public void setFaltante(String Faltante) {
        this.Faltante = Faltante;
    }

    public String getOrden() {
        return Orden;
    }

    public void setOrden(String Orden) {
        this.Orden = Orden;
    }
    
}


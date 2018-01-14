/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libClases;

/**
 *
 * @author carlos
 */
public class ClienteMovil extends Cliente {
    
    private int minutos;
    private Fecha Permanencia;
    private int tarifa;
    public ClienteMovil(String NIF, String nom, Fecha fNac, Fecha perman, int minut, int tarf) {
        super(NIF, nom, fNac);
        perman=Permanencia;
        minut=minutos;
        tarf=tarifa;
    }
    
    public float calculoFactura()
    {
        return (float) (tarifa*minutos);
    }

    public int getMinutos() {
        return minutos;
    }

    public Fecha getPermanencia() {
        return Permanencia;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setPermanencia(Fecha Permanencia) {
        this.Permanencia = Permanencia;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    
}

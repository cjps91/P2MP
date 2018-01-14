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
public class ClienteTF extends Cliente {
    
    private int precio;
    private int limite;
    private int exceso;
    private int minutos;
    private String nacion;
    public ClienteTF(String NIF, String nom, Fecha fNac, int prec, int limit, String nac, int exc, int minut) {
        super(NIF, nom, fNac);
        prec=precio;
        limit=limite;
        nac=nacion;
        exc=exceso;
        minut=minutos;
    }
    public float calculoFactura()
            {
                if(minutos>limite)
                {
                    exceso=minutos-limite;
                }
                else
                {
                    exceso=0;
                }
                return (float) (precio+exceso*0.15);
            }

    public int getPrecio() {
        return precio;
    }

    public int getLimite() {
        return limite;
    }

    public int getExceso() {
        return exceso;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getNacion() {
        return nacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setExceso(int exceso) {
        this.exceso = exceso;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }
    
}
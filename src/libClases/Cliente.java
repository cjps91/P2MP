/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libClases;

/**
 *
 * @author usuario
 */
public class Cliente {
    static private int n=0;
    static private Fecha FechaAltDef = new Fecha(1,1,2018);
    
    private final String nif; //dni del cliente (letra incluida) (NO puede cambiar)
    private final int codCliente; //codigo único (y fijo) generado por la aplicación
    private String nombre; //nombre completo del cliente (SI se puede modificar)
    private final Fecha fechaNac; //fecha nacimiento del cliente (NO se puede cambiar)
    private final Fecha fechaAlta; //fecha de alta del cliente (SI se puede modificar
    public Cliente (String NIF, String nom, Fecha fNac, Fecha fAlta)
    {
        nif=NIF;
        nombre=nom;
        fechaNac=fNac;
        fechaAlta=fAlta;
        codCliente=n;
        n=n+1;
        
    }
    public Cliente (String NIF, String nom, Fecha fNac)
    {
        nif=NIF;
        nombre=nom;
        fechaNac=fNac;
        codCliente=n;
        n=n+1;
        fechaAlta=FechaAltDef;
    }
    @Override
    public String toString()
    {
        return "" + this.nif + "/" + this.codCliente + "/" +this.nombre + "/" +this.fechaNac + "/" +this.fechaAlta;
    }
}

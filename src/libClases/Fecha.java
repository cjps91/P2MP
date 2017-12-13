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
public class Fecha {
    private int dia, mes, anio;
    
    public Fecha(int d, int m, int a)
    {
        this.dia=d;
        this.mes=m;
        this.anio=a;
    } 
    @Override
    public String toString()
    {
        return "" + this.dia + "/" + this.mes + "/" +this.anio;
    }
    public int getDia() {return dia;}
}

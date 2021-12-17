/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jak3;

/**
 *
 * @author jcoq2
 */
public class Ataque extends Carro 
{
    private double porcentajeExtra;

    public Ataque(double porcentajeExtra, double velocidad, double porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
        this.porcentajeExtra = porcentajeExtra;
    }

    public double getPorcentajeExtra() {
        return porcentajeExtra;
    }

    public void setPorcentajeExtra(double porcentajeExtra) {
        this.porcentajeExtra = porcentajeExtra;
    }

    @Override
    public String toString() {
        return "Ataque{" + "porcentajeExtra=" + porcentajeExtra + '}';
    }
    
}

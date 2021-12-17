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
public class Salto extends Carro
{
    private int metrosExtras;

    public Salto(int metrosExtras, double velocidad, double porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
        this.metrosExtras = metrosExtras;
    }

    public int getMetrosExtras() {
        return metrosExtras;
    }

    public void setMetrosExtras(int metrosExtras) {
        this.metrosExtras = metrosExtras;
    }

    @Override
    public String toString() {
        return "Salto{" + "metrosExtras=" + metrosExtras + '}';
    }
    
}

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
public class Belico extends Carro
{
    private int vidaExtra;

    public Belico(int vidaExtra, double velocidad, double porcentajeDerrape, String nombre, int ataque, int vida) {
        super(velocidad, porcentajeDerrape, nombre, ataque, vida);
        this.vidaExtra = vidaExtra;
    }

    public int getVidaExtra() {
        return vidaExtra;
    }

    public void setVidaExtra(int vidaExtra) {
        this.vidaExtra = vidaExtra;
    }

    @Override
    public String toString() {
        return "Belico{" + "vidaExtra=" + vidaExtra + '}';
    }
    
}

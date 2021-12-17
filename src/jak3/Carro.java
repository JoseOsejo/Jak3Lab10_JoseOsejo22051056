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
public class Carro 
{
    private double velocidad;
    private double porcentajeDerrape;
    private String nombre;
    private int ataque;
    private int vida;

    public Carro(double velocidad, double porcentajeDerrape, String nombre, int ataque, int vida) {
        this.velocidad = velocidad;
        this.porcentajeDerrape = porcentajeDerrape;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPorcentajeDerrape() {
        return porcentajeDerrape;
    }

    public void setPorcentajeDerrape(double porcentajeDerrape) {
        this.porcentajeDerrape = porcentajeDerrape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

  
    
    
}

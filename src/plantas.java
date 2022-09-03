/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50497
 */
public class plantas extends Entidad {
    private String tipo;
private String rango;
    public plantas() {
        super();
    }

    public plantas(String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.tipo = tipo;
        
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "plantas{" + "tipo=" + tipo + super.toString();
    }
    
    
    
}

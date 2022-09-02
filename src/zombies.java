/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50497
 */
public class zombies extends Entidad {
    private String tipo;
    public zombies() {
        super();
    }

    public zombies(String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "zombies{" + "tipo=" + tipo + '}';
    }
}

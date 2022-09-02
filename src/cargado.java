
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50497
 */
public class cargado extends zombies {
    //tamaño, edad, nivel de enojo y una lista de nombres de personas que han comido (strings)
    private int  tamanio;
    private int edad;
    private int enojo;
    private ArrayList<String> comidas = new ArrayList();

    public cargado() {
        super();
    }

    public cargado(int tamanio, int edad, int enojo, String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.tamanio = tamanio;
        this.edad = edad;
        this.enojo = enojo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public int getEnojo() {
        return enojo;
    }

    public ArrayList<String> getComidas() {
        return comidas;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public void setComidas(ArrayList<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "cargado{" + "tamanio=" + tamanio + ", edad=" + edad + ", enojo=" + enojo + ", comidas=" + comidas + '}';
    }
    
    
    
    
    
}

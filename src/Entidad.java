
public class Entidad {
    private String nombre;
    private float ataque;
    private float vida;

    public Entidad() {
    }

    public Entidad(String nombre, float ataque, float vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAtaque() {
        return ataque;
    }

    public float getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Entidad{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
}

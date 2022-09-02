 
public class explosiva extends plantas {
  // Disparo: Tiene nombre de proyectil, color.• Defensa: Tiene altura, nivel de dureza y peso
        private int magnitud;

    public explosiva() {
        super();
    }

    public explosiva(String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.magnitud = magnitud;
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "explosiva{" + "magnitud=" + magnitud + '}';
    }
        
    
}

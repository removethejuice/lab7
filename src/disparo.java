 
public class disparo extends plantas {
      //   Defensa: Tiene altura, nivel de dureza y peso
    private String proyectil;
    private String color;

    public disparo(String proyectil, String color) {
       super();
    }

    public disparo(String proyectil, String color, String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.proyectil = proyectil;
        this.color = color;
    }

    public String getProyectil() {
        return proyectil;
    }

    public String getColor() {
        return color;
    }

    public void setProyectil(String proyectil) {
        this.proyectil = proyectil;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "disparo{" + "proyectil=" + proyectil + ", color=" + color + '}';
    }
    
}

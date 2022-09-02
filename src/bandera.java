
public class bandera {

    private String Color;
    private String direccion;

    public bandera() {
    }

    public bandera(String Color, String direccion) {
        this.Color = Color;
        this.direccion = direccion;
    }

    public String getColor() {
        return Color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "bandera{" + "Color=" + Color + ", direccion=" + direccion + '}';
    }
    
    
}

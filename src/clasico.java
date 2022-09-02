 
public class clasico extends zombies {
  //Tiene años de experiencia siendo zombie y una bandera La bandera tiene color y direcciónde imagen.
    private  int experiencia;
    private bandera b1;

    public clasico() {
        super();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public bandera getB1() {
        return b1;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setB1(bandera b1) {
        this.b1 = b1;
    }

    @Override
    public String toString() {
        return "clasico{" + "experiencia=" + experiencia + ", b1=" + b1 + super.toString();
    }
    
}

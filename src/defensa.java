
public class defensa extends plantas {
    //   Defensa: Tiene altura, nivel de dureza y peso

    private int altura;
    private int dureza;
    private int peso;

    public defensa(int altura, int dureza, int peso) {
        super();
    }

    public defensa(int altura, int dureza, int peso, String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getDureza() {
        return dureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "defensa{" + "altura=" + altura + ", dureza=" + dureza + ", peso=" + peso + '}';
    }
 

}

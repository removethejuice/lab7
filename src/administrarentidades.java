
import java.io.File;
import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class administrarentidades {

    private ArrayList<plantas> p1 = new ArrayList();
    private ArrayList<zombies> z1 = new ArrayList();
    private File archivoplantas = new File("./plantas.txt");
    private File archivozombies = new File("./zombies.txt");

    public administrarentidades() {

    }

    public void setP1(ArrayList<plantas> p1) {
        this.p1 = p1;
    }

    public void setZ1(ArrayList<zombies> z1) {
        this.z1 = z1;
    }

    public void setArchivoplantas(File archivoplantas) {
        this.archivoplantas = archivoplantas;
    }

    public void setArchivozombies(File archivozombies) {
        this.archivozombies = archivozombies;
    }

    public ArrayList<plantas> getP1() {
        return p1;
    }

    public ArrayList<zombies> getZ1() {
        return z1;
    }

    public File getArchivoplantas() {
        return archivoplantas;
    }

    public File getArchivozombies() {
        return archivozombies;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivoplantas, false);
            bw = new BufferedWriter(fw);
            for (plantas t : p1) {
                bw.write(t.toString() + "|");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void escribirArchivoz() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivozombies, false);
            bw = new BufferedWriter(fw);
            for (zombies t : z1) {
                bw.write(t.toString() + "|");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void leerarchivo() throws IOException {
        String Nombre = "";
        String Rango = "";
        String Proyectil = "";
        String Color = "";
        float ataque = 0;
        float vida = 0;
        int peso = 80;
        int altura = 0;
        int dureza = 0;
        int magnitud = 0;
        String[] x3;
        BufferedReader br = null;
        p1 = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(archivoplantas));

            String[] x1 = br.readLine().split("\\|");
            for (int i = 0; i < x1.length; i++) {
                String[] x2 = x1[i].split("_");
                for (int w = 0; w < x2.length; w++) {
                    if (x2[w].contains(":")) {
                        x3 = x2[w].split(":");
                        x3[1].substring(x3[i].indexOf("(" + 1));
                        x3[1].substring(x3[i].indexOf(")"));
                        String[] x5 = x3[1].split(";");

                        for (int z = 0; z < x5.length; z++) {
                            String x7[] = x5[z].split("=");
                            if (x7[0].equals("Proyectil")) {
                                Proyectil = x7[1];
                            } else if (x7[0].equals("Color")) {
                                Color = x7[1];
                            } else if (x7[0].equals("Altura")) {
                                altura = Integer.parseInt(x7[1]);
                            } else if (x7[0].equals("Peso")) {
                                peso = Integer.parseInt(x7[1]);
                            } else if (x7[0].equals("Dureza")) {
                                dureza = Integer.parseInt(x7[1]);
                            } else if (x7[0].equals("Magnitud de Explosion")) {
                                magnitud = Integer.parseInt(x7[1]);
                            }
                        }// fin del for

                    } else {
                        String[] x4 = x2[w].split(",");

                        for (int z = 0; z < x2.length; z++) {
                            String x6[] = x4[z].split("=");
                            if (x6[0].equals("Nombre")) {
                                Nombre = x4[1];
                            } else if (x6[0].equals("Rango")) {
                                Rango = x4[1];
                            } else if (x6[0].equals("Ataque")) {
                                ataque = Float.parseFloat(x4[1]);
                            } else {
                                vida = Float.parseFloat(x4[1]);
                            }
                        }// fin del for dentro del else
                    }
                    if (x3[0].equals("Defensa")) {
                    }
                }

            }

        } catch (Exception e) {

        }
        br.close();

    }

}

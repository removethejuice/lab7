
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

        BufferedReader br = null;
        p1 = new ArrayList();
        try {
            br = new BufferedReader(new FileReader(archivoplantas));

            String[] x1 = br.readLine().split("\\|");
            for (int i = 0; i < x1.length; i++) {
                String[] x2 = x1[i].split("_");
                for (int w = 0; w < x2.length; w++) {

                }

            }

        } catch (Exception e) {

        }
        br.close();

    }

}

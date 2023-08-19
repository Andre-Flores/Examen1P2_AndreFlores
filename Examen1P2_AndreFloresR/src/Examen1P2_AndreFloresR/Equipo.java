package Examen1P2_AndreFloresR;

import java.util.ArrayList;

public class Equipo {

    private String nombreequipo;
    private String pais;
    private int Rating;
    private ArrayList<jugador> plantilla;

    public Equipo(String nombreequipo, String pais, int Rating, ArrayList<jugador> plantilla) {
        this.nombreequipo = nombreequipo;
        this.pais = pais;
        this.Rating = Rating;
        this.plantilla = plantilla;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public ArrayList<jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreequipo=" + nombreequipo + ", pais=" + pais + ", Rating=" + Rating + ", plantilla=" + plantilla + '}';
    }

}

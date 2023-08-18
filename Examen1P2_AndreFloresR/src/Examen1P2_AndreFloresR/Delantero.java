
package Examen1P2_AndreFloresR;

public class Delantero extends jugador {
    
    public Delantero(String nombre, int edad, String nacionalidad, String pieHabil, int rating, Equipo equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, equipo, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    @Override
    public void ratingtiene() {
    }

    @Override
    public void ratingnotiene() {
    }
    
}

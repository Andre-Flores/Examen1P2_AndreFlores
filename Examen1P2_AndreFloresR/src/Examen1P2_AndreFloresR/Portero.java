package Examen1P2_AndreFloresR;

import java.util.Random;

public class Portero extends jugador {

    public Portero(String nombre, int edad, String nacionalidad, String pieHabil) {
        super(nombre, edad, nacionalidad, pieHabil);
    }

    

    @Override
    public void ratingtiene() {
        Random random = new Random();
        int intentos = 0;

        while (intentos < 1000) {  // Limitar a un máximo de 1000 intentos
            int num1 = random.nextInt(12) + 1;
            int num2 = random.nextInt(12) + 1;
            int num3 = random.nextInt(12) + 1;

            int resultado1 = num1 * 12;
            int resultado2 = num2 * 12;
            int resultado3 = num3 * 12;

            if (resultado1 >= 70) {
                this.setAgarre(resultado1);
            }
            if (resultado2 >= 70) {
                this.setLanzamiento(resultado2);
            }
            if (resultado3 >= 70) {
                this.setPassing(resultado3);
            }

            intentos++;
        }
    }

    @Override
    public void ratingnotiene() {
        Random random = new Random();
        int intentos = 0;

        while (intentos < 1000) {  // Limitar a un máximo de 1000 intentos
            int num1 = random.nextInt(5) + 1;
            int num2 = random.nextInt(5) + 1;
            int num3 = random.nextInt(5) + 1;

            int resultado1 = num1 * 13;
            int resultado2 = num2 * 13;
            int resultado3 = num3 * 13;
            int resultado4 = num1 * 13;
            int resultado5 = num2 * 13;
            int resultado6 = num3 * 13;

            if (resultado1 >= 70) {
                this.setFisico(resultado1);
            }
            if (resultado2 >= 70) {
                this.setRitmo(resultado2);
            }
            if (resultado3 >= 70) {
                this.setEntrada(resultado3);
            }
            if (resultado4 >= 70) {
                this.setVision(resultado4);
            }
            if (resultado5 >= 70) {
                this.setRegate(resultado5);
            }
            if (resultado6 >= 70) {
                this.setDisparo(resultado6);
            }

            intentos++;
        }
    }
}

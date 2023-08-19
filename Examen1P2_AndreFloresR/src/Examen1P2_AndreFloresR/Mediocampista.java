package Examen1P2_AndreFloresR;

import java.util.Random;

public class Mediocampista extends jugador {

    public Mediocampista(String nombre, int edad, String nacionalidad, String pieHabil) {
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
                this.setVision(resultado1);
            }
            if (resultado2 >= 70) {
                this.setPassing(resultado2);
            }
            if (resultado3 >= 70) {
                this.setRegate(resultado3);
            }

            intentos++;
        }
    }

    @Override
    public void ratingnotiene() {
        Random random = new Random();
        int intentos = 0;

        while (intentos < 1000) {
            int num1 = random.nextInt(5) + 1;
            int num2 = random.nextInt(5) + 1;
            int num3 = random.nextInt(5) + 1;

            int resultadon1 = num1 * 13;
            int resultadon2 = num2 * 13;
            int resultadon3 = num3 * 13;
            int resultadon4 = num1 * 13;
            int resultadon5 = num2 * 13;
            int resultadon6 = num3 * 13;

            if (resultadon1 >= 70) {
                this.setAgarre(resultadon1);
            }
            if (resultadon2 >= 70) {
                this.setLanzamiento(resultadon2);
            }
            if (resultadon3 >= 70) {
                this.setFisico(resultadon3);
            }
            if (resultadon4 >= 70) {
                this.setEntrada(resultadon4);
            }
            if (resultadon5 >= 70) {
                this.setRitmo(resultadon5);
            }
            if (resultadon6 >= 70) {
                this.setDisparo(resultadon6);
            }

            intentos++;
        }
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = Tablero.getInstance();

        Funciones.generarAleatorio(tablero);


        for (int i=0; i<10; i++) {
            Funciones.pedirSecuencia(tablero);
            if (Funciones.comprobarSecuencia(tablero.getCifraAleatoria(), tablero.getCifraSecuencia())){
                Funciones.mostrar("¡WIN!");
                break;
            } else {
                Funciones.mostrarPista(tablero.getCifraPista());
            }
        }

        Funciones.mostrar("FIN");
    }
}


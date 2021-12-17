package com.company;

public class Tablero {
    private String cifraAleatoria;
    private String cifraSecuencia;
    private String cifraPista;

    public String getCifraAleatoria() {
        return cifraAleatoria;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public String getCifraPista() {
        return cifraPista;
    }

    public void setCifraAleatoria(String cifraAleatoria) {
        this.cifraAleatoria = cifraAleatoria;
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }


    public static Tablero getInstance() {
        return null;
    }

}

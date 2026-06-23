package br.com.soundmusic.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificao() >= 9) {
            System.out.println(audio.getTitulo() + " Sucesso do momento!");
        } else if (audio.getClassificao() >= 7) {
            System.out.println(audio.getTitulo() + " Está entre as mais ouvidas!");
        } else {
            System.out.println(audio.getTitulo() + " vale apena ouvir depois!");
        }
    }
}

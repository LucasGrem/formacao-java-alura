package br.com.soundmusic.principal;

import br.com.soundmusic.modelo.MinhasPreferidas;
import br.com.soundmusic.modelo.Music;
import br.com.soundmusic.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        //musica
        Music music1 = new Music();
        music1.setTitulo("Férias");
        music1.setArtista("Ryu, the runner");
        music1.setGravadora("Som livre");

        for (int i = 0; i < 1240; i++) {
            music1.curtir();
        }

        for (int i = 0; i < 2000; i++) {
            music1.reproduz();
        }

        //poscast
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Bolha DEV");
        podcast1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 643; i++) {
            podcast1.curtir();
        }

        for (int i = 0; i < 800; i++) {
            podcast1.reproduz();
        }

        //preferidas
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(music1);
        preferidas.inclui(podcast1);

    }
}
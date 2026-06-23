package br.com.soundmusic.modelo;

public class Music extends Audio{

    private String artista;
    private String gravadora;


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public void exibirFicha() {
        System.out.println("Título: " + getTitulo() + "\nArtista: " + getArtista() + "\nDuração: " + getDuracao());
        System.out.println("O total de reprodução: " + getTotalReproducao());
        System.out.println("Total de curtidas: " + getCurtidas() + "\nClassificação: " + getClassificao());
        System.out.println("Gravadora: " + getGravadora());
    }

    @Override
    public double getClassificao() {
        if (this.getTotalReproducao() > 1500) {
            return 10;
        } else if (this.getTotalReproducao() > 500) {
            return 7;
        } else {
            return 5;
        }
    }
}

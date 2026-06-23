package br.com.soundmusic.modelo;

public class Podcast extends Audio{

    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibirFicha() {
        System.out.println("Título: " + getTitulo() + "\nApresentador: " + getApresentador() + "\nDuração: " + getDuracao());
        System.out.println("O total de reprodução: " + getTotalReproducao());
        System.out.println("Total de curtidas: " + getCurtidas() + "\nClassificação: " + getClassificao());
        System.out.println("descrição: " + getDescricao());
    }

    @Override
    public double getClassificao() {
        if (this.getCurtidas() > 800) {
            return 10;
        } else if (this.getCurtidas() > 500) {
            return 8;
        } else {
            return 6;
        }
    }
}

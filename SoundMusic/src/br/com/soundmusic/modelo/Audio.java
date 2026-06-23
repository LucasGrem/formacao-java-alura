package br.com.soundmusic.modelo;

public class Audio {

    private String Titulo;
    private double duracao;
    private int totalReproducao;
    private int curtidas;
    private double classificao;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificao() {
        return classificao;
    }

    public void setClassificao(double classificao)  {
        this.classificao = classificao;
    }

    public void curtir() {
        this.curtidas ++;
    }

    public void reproduz() {
        this.totalReproducao ++;
    }

    public void exibirFicha() {
        System.out.println("Título: " + getTitulo() + "\nDuração: " + getDuracao());
        System.out.println("O total de reprodução: " + getTotalReproducao());
        System.out.println("Total de curtidas: " + getCurtidas() + "\nClassificação: " + getClassificao());
    }
}

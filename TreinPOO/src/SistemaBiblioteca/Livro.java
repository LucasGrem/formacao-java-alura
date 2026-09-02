package SistemaBiblioteca;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public void exibirLivro() {
        System.out.printf("\"%s\" de %s com %s páginas.", titulo, autor, paginas);
    }
}

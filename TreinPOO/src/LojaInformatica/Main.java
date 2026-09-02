package LojaInformatica;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Mouse gamer";
        produto1.preco = 159.90;
        produto1.quantidade = 25;

        produto1.exibirProduto();

    }
}
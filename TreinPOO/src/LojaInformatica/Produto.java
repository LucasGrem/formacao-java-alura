package LojaInformatica;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirProduto() {
        System.out.printf("LojaInformatica.Produto: %s\n" +
                "Preço: R$ %.2f\n" +
                "Quantidade em estoque: %s", nome, preco, quantidade);
    }
}

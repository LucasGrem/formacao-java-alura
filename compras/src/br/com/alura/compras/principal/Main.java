package br.com.alura.compras.principal;

import br.com.alura.compras.modelo.Cartao;
import br.com.alura.compras.modelo.Produto;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;

        //limite do cartão
        System.out.println("Digite o limite do cartão:");
        int limiteCartao = scanner.nextInt();
        scanner.nextLine(); //limpa buffer
        Cartao cartao = new Cartao(limiteCartao);

        do {
            //descrição da compra
            System.out.println("digite a descrição da compra:");
            String descricaoCompra = scanner.nextLine();

            //valor da compra
            System.out.println("digite o valor da compra:");
            int valorCompra = scanner.nextInt();
            scanner.nextLine(); //limpa buffer

            //compra
            Produto compra = new Produto(descricaoCompra, valorCompra);
            boolean compraRealizada = cartao.LancaCompra(compra);

            if (compraRealizada) {
                System.out.println("compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                continue;
            }

            //encerramento
            System.out.println("Digite 0 para sair ou 1 para continuar:");
            int pergunta = scanner.nextInt();
            scanner.nextLine(); //limpa buffer
            if (pergunta == 0) {
                contador = 0;
            }

        } while (contador != 0);

        System.out.println("************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Produto c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("\n************************");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());

    }
}
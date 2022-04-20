package com.company;

import java.util.Scanner;

public class Ex0303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operacoes = new String[]{"adição", "subtração"};
        System.out.println("Escolha dentre as operaões abaixo: ");
        for (int i = 0; i < operacoes.length; i ++){
            System.out.println("[" + i + "]" + operacoes[i]);
        }
        System.out.println("A operação escolhida é: ");
        Integer posicaoOperacaoEscolhida = scanner.nextInt();
        Boolean operacaoValida = posicaoOperacaoEscolhida >=0 && posicaoOperacaoEscolhida < operacoes.length;
        if (!operacaoValida){
            encerrarProgramaDevidoOperacaoinvalida();
        }
        imprimirTraco();
        String operacaoEscolhida = operacoes[posicaoOperacaoEscolhida];
        System.out.println("A operação escolhida foi " + operacaoEscolhida);
        imprimirTraco();
        System.out.println("Insira um primeiro número: ");
        Integer primeiroNumero = scanner.nextInt();
        System.out.println("Insira um segundo número: ");
        Integer segundoNumero = scanner.nextInt();
        if (posicaoOperacaoEscolhida == 0) {
            double adicao = primeiroNumero + segundoNumero;
            System.out.println("O resultado da operação é: " + primeiroNumero + "+" + segundoNumero + "=" + adicao);
        }else {
            double subtracao = primeiroNumero - segundoNumero;
            System.out.println("O resultado da operação é: " + primeiroNumero + "-" + segundoNumero + "=" + subtracao);
        }
        }
    static void encerrarProgramaDevidoOperacaoinvalida() {
        System.out.println("Operação inválida!");
        System.exit(1);
    }
    static void imprimirTraco() {
        System.out.println("------------------------------------------------");
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Arvore arvore = new Arvore(4);
    arvore.inserir(2);
    arvore.inserir(1);
    arvore.inserir(3);
    arvore.inserir(6);
    arvore.inserir(7);
    arvore.inserir(5);

        System.out.println( "Pre-ordem");
        arvore.preOrdem();
        System.out.println("\n in ordem");
        arvore.inOrdem();
        System.out.println("\n pos ordem");
        arvore.posOrdem();
        System.out.println("\n ordem invertida");
        arvore.inOrdemIvertida();










    }
}

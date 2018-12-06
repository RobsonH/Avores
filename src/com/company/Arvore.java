package com.company;

public class Arvore {

    private int conteudo;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(int conteudo) {
        this.conteudo = conteudo;
        esquerda = direita = null;
    }

    public void inserir (int valor){


        //Inserir na esquerda
        if(valor < conteudo){
            if (esquerda == null){
                esquerda= new Arvore(valor);
                System.out.println(valor + " a esquerda de " + conteudo);
            }else {
                esquerda.inserir(valor);
            }
        }else if(valor > conteudo){//inserir na direita
            if (direita == null){
                direita = new Arvore(valor);
                System.out.println(valor + " a direita de " + conteudo);
            }else {
                direita.inserir(valor);
            }

        }
    }











    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }

    public Arvore getDireita() {
        return direita;
    }

    public void setDireita(Arvore direita) {
        this.direita = direita;
    }
}
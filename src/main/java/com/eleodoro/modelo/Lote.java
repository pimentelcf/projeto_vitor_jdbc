package com.eleodoro.modelo;

public class Lote {

    private String numeracaoLote;

    private  String nome;

    private int quantidade;

    public Lote() {
    }

    public Lote(String numeracaoLote, String nome, int quantidade) {
        this.numeracaoLote = numeracaoLote;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNumeracaoLote() {
        return numeracaoLote;
    }

    public void setNumeracaoLote(String numeracaoLote) {
        this.numeracaoLote = numeracaoLote;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Lote [numeracaoLote=" + numeracaoLote + ", nome=" + nome + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeracaoLote == null) ? 0 : numeracaoLote.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + quantidade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lote other = (Lote) obj;
        if (numeracaoLote == null) {
            if (other.numeracaoLote != null)
                return false;
        } else if (!numeracaoLote.equals(other.numeracaoLote))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (quantidade != other.quantidade)
            return false;
        return true;
    }

    
    








 
    












































}

package com.example.Project4.Produtos;

import jakarta.persistence.*;
import  jakarta.persistence.Table;

@Table(name = "Produtos")

@Entity

public class Produtos {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = " name",nullable = false, length = 50)
    private String name;
    @Column(name = "quantidade ",nullable = false, length = 50)
    private int quantidade;
    @Column(name = " preco ",nullable = false, length = 50)
    private float preco;

    public Produtos( long id ,String name , int quantidade, float preco) {
        super();
        this.id = id;
        this.quantidade = quantidade;
        this.name = name;
        this.preco = preco;
    }

    public Produtos(String name, int quantidade, float preco) {
        super();
        this.name = name;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produtos() {

    }


    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

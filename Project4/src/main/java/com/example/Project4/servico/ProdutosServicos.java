package com.example.Project4.servico;

import com.example.Project4.Produtos.Produtos;

import java.util.List;

public interface ProdutosServicos {
    public List<Produtos> listarTodos();

    public Produtos guardarProdutos(Produtos produtos);

    public  Produtos obterProdutos(long id);

    public  Produtos atualziar(Produtos produtos);

    public Produtos excluir(Long id);
}

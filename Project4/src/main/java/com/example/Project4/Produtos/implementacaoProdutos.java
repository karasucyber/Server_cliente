package com.example.Project4.Produtos;
import com.example.Project4.Repository.ProdutosRepository;
import com.example.Project4.servico.ProdutosServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class implementacaoProdutos implements ProdutosServicos {

@Autowired
private ProdutosRepository repository ;
    private com.example.Project4.Produtos.Produtos Produtos;

    public List<Produtos> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Produtos guardarProdutos(Produtos produtos) {
        return repository.save(produtos);
    }

    @Override
    public Produtos obterProdutos(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Produtos atualziar(Produtos produtos) {
        return repository.save(Produtos);

    }

    @Override
    public Produtos excluir(Long id) {
        repository.deleteById(id);
       return null;
    }
}

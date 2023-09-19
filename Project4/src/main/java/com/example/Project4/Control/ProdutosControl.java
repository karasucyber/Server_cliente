package com.example.Project4.Control;

import com.example.Project4.Produtos.Produtos;
import com.example.Project4.servico.ProdutosServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProdutosControl {
    @Autowired
    private ProdutosServicos servicoos;

    @GetMapping({"/Produtos", "/"})
    public String listarProdutos(Model modelo) {
        modelo.addAttribute("Produtos", servicoos.listarTodos());
        return "Produtos";
    }


    @GetMapping("/Produtos/novo")
    public String criarProdutos(Model modelo){
        Produtos produtos = new Produtos();
        modelo.addAttribute("Prodtuos", produtos);
        return "criar_Produtos";
    }


    @GetMapping("/Produtos")
    public String guardarProdutos(@ModelAttribute("Produtos") Produtos produtos ){
        servicoos.guardarProdutos(produtos);
        return  "redirect:/produtos";

    }

    @GetMapping("Produtos/edit/{id}")
    public String editFormulario(@PathVariable Long id,Model modelo){
        modelo.addAttribute("Produtos", servicoos.obterProdutos(id));
        return "edit";
    }


    @GetMapping("Produtos/{id}")
    public String atualizarProdutos(@PathVariable Long id, @ModelAttribute("Produtos")Produtos produtos, Model model){
       Produtos produtosExistentes = servicoos.obterProdutos(id);
       produtosExistentes.setId(id);
       produtosExistentes.setName(produtos.getName());
       produtosExistentes.getPreco();

        return "redirect:/Produtos";
    }


    @GetMapping("Produtos/{id}")
    public String excluir(@PathVariable Long id){
         servicoos.excluir(id);

         return "redirect:/Produtos";
    }





}

package me.dio.api.service;

import me.dio.api.model.Produto;
import me.dio.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }
}

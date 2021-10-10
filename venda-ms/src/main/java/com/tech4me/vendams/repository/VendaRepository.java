package com.tech4me.vendams.repository;

import java.util.List;

import com.tech4me.vendams.model.Venda;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendaRepository extends MongoRepository<Venda, String>{
     
    List<Venda> findByIdDoProduto(String idDoProduto); 
}

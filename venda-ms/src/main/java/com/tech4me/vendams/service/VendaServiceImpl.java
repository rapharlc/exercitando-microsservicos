package com.tech4me.vendams.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tech4me.vendams.compartilhado.VendaDto;
import com.tech4me.vendams.model.Venda;
import com.tech4me.vendams.repository.VendaRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository repositorioVenda;

    @Override
    public VendaDto criarVenda(VendaDto vendaDto) {
        ModelMapper mapper = new ModelMapper();
        Venda vendaEntidade = mapper.map(vendaDto, Venda.class);
        vendaEntidade = repositorioVenda.save(vendaEntidade);
        return mapper.map(vendaEntidade, VendaDto.class); 
    }

    @Override
    public List<VendaDto> obterTodos() {
        List<Venda> vendas = repositorioVenda.findAll();
        return vendas.stream().map(venda -> new ModelMapper().map(venda, VendaDto.class)).collect(Collectors.toList());
    }

    @Override
    public Optional<VendaDto> obterPorId(String id) {
        Optional<Venda> venda = repositorioVenda.findById(id);

        if(venda.isPresent()){
            return Optional.of(new ModelMapper().map(venda, VendaDto.class));
        }
        return Optional.empty();
    }

    @Override
    public void removerVenda(String id) {
        repositorioVenda.deleteById(id);
        
    }

    @Override
    public List<VendaDto> obterPorIdDoProduto(String idDoProduto) {
        List<Venda> vendas = repositorioVenda.findByIdDoProduto(idDoProduto);
        
        return vendas.stream().map(venda -> new ModelMapper().map(venda, VendaDto.class)).collect(Collectors.toList());
    }
    
}

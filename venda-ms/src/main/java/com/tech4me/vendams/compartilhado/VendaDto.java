package com.tech4me.vendams.compartilhado;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class VendaDto {

    private String id;
    private Date dataDaVenda;
    @NotBlank(message = "Você deve informar um produto para venda")
    @NotEmpty(message = "Você deve informar um produto para venda")
    private String idProdutoVendido;
    @NotBlank(message = "Você deve vender ao menos uma unidade do produto")
    @NotEmpty(message = "Você deve vender ao menos uma unidade do produto")
    @Positive(message = "A quantidade deve ser maior que zero")
    private int quantidadeVendida;
    
    
    public String getId() {
        return id;
    }
    public String getIdProdutoVendido() {
        return idProdutoVendido;
    }
    public void setIdProdutoVendido(String idProdutoVendido) {
        this.idProdutoVendido = idProdutoVendido;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getDataDaVenda() {
        return dataDaVenda;
    }
    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
    
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    
}

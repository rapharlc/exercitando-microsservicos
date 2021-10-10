package com.tech4me.vendams.model;


import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Venda {
@Id
private String id;
private Date dataDaVenda;
private String idProdutoVendido;
private int quantidadeVendida;



public Venda() {
    Date data = new Date();
    setDataDaVenda(data);
}
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

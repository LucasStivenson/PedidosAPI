package br.edu.ifsul.pedidos.model;

import java.util.List;

public class Pedido {
    private Long id;
    private List<ItemPedido> itens;
    private double valorTotal;
    private double desconto;

    public Pedido() {
    }

    public Pedido(Long id, List<ItemPedido> itens, double valorTotal, double desconto) {
        this.id = id;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}

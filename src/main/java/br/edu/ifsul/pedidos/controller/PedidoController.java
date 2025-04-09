package br.edu.ifsul.pedidos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsul.pedidos.model.ItemPedido;
import br.edu.ifsul.pedidos.model.Pedido;

@RestController
public class PedidoController {
    private List<Pedido> pedidos = new ArrayList<>();
    private List<ItemPedido> itens = new ArrayList<>();
    double valorTotal;
    double desconto;

    @PostMapping("/pedidos")
    public List<Pedido> postMethod(@RequestBody Pedido pedido) {
        itens = pedido.getListaPedidos();
        for (ItemPedido item : itens) {
            valorTotal += item.getQuantidade() * item.getProduto().getPreco();
        }
        if (valorTotal >= 1000) {
            desconto = valorTotal * 0.15;
            valorTotal = valorTotal - desconto;
        } else {
            if (valorTotal >= 500) {
                desconto = valorTotal * 0.10;
                valorTotal = valorTotal - desconto;
            }
        }
        pedido.setValorTotal(valorTotal);
        pedido.setDesconto(desconto);
        pedidos.add(pedido);
        return pedidos;
    }
}

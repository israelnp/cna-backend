package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;


    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estadoPagamento, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    @Override
    public String toString() {
        return "PagamentoComCartao{" +
                "numeroDeParcelas=" + numeroDeParcelas +
                ", id=" + id +
                ", estadoPagamento=" + estadoPagamento +
                ", pedido=" + pedido.getId() +
                '}';
    }
}

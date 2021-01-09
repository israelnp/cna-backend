package com.nelioalves.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento {

    private static final long serialVersionUID = 1L;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataDeVencimento;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataDePagamento;

    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataDeVencimento, Date dataDopagamento) {
        super(id, estadoPagamento, pedido);
        this.dataDeVencimento = dataDeVencimento;
        this.dataDePagamento = dataDopagamento;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Date getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(Date dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    @Override
    public String toString() {
        return "PagamentoComBoleto{" +
                "dataDeVencimento=" + dataDeVencimento +
                ", dataDePagamento=" + dataDePagamento +
                ", id=" + id +
                ", estadoPagamento=" + estadoPagamento +
                ", pedido=" + pedido.getId() +
                '}';
    }
}

package Pedido;

import PedidoBuilder.PedidoBuilder;
import java.util.List;

public class Pedido {

    private final String tipo;
    private final String tamanho;
    private final String pagamento;
    private final List<String> itens;

    private final String tipoPao;
    private final String tipoMassa;
    private final boolean bordaRecheada;

    private final String entrega;
    private final String enderecoEntrega;

    private final String cupom;
    private final String observacao;

    private final Double trocoPara;

    public Pedido(PedidoBuilder builder) {
        this.tipo = builder.tipo;
        this.tamanho = builder.tamanho;
        this.pagamento = builder.pagamento;
        this.itens = builder.itens;

        this.tipoPao = builder.tipoPao;
        this.tipoMassa = builder.tipoMassa;
        this.bordaRecheada = builder.bordaRecheada;

        this.entrega = builder.entrega;
        this.enderecoEntrega = builder.enderecoEntrega;

        this.cupom = builder.cupom;
        this.observacao = builder.observacao;

        this.trocoPara = builder.trocoPara;
    }

    public void printResumo() {

        System.out.println("\n---- RESUMO DO PEDIDO ----");

        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);

        System.out.println("Itens: ");
        for (String item : itens) {
            System.out.println("- " + item);
        }

        if (tipoPao != null)
            System.out.println("Pão: " + tipoPao);

        if (tipoMassa != null)
            System.out.println("Massa: " + tipoMassa);

        if ("PIZZA".equals(tipo))
            System.out.println("Borda recheada: " + bordaRecheada);

        System.out.println("Pagamento: " + pagamento);

        if (trocoPara != null)
            System.out.println("Troco para: " + trocoPara);

        System.out.println("Entrega: " + entrega);

        if (enderecoEntrega != null)
            System.out.println("Endereço: " + enderecoEntrega);

        if (cupom != null)
            System.out.println("Cupom: " + cupom);

        if (observacao != null)
            System.out.println("Observação: " + observacao);

        System.out.println("----------------\n");
    }
}
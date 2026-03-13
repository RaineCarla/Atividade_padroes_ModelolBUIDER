import Pedido.Pedido;
import PedidoBuilder.PedidoBuilder;

public class Main {

    public static void main(String[] args) {

        Pedido p1 = new PedidoBuilder()
                .tipoHamburguer()
                .tamanhoM()
                .tipoPao("BRIOCHE")
                .addItem("X-Bacon")
                .pagarComPix()
                .entregaDelivery("Rua Suzana de Bairros")
                .comObservacao("sem cebola")
                .build();

        p1.printResumo();

        Pedido p2 = new PedidoBuilder()
                .tipoPizza()
                .tamanhoG()
                .tipoMassa("FINA")
                .addItem("Pizza Calabresa")
                .comBordaRecheada()
                .pagarComCartao()
                .entregaRetirada()
                .comCupom("10OFF")
                .build();

        p2.printResumo();

        Pedido p3 = new PedidoBuilder()
                .tipoHamburguer()
                .tamanhoP()
                .tipoPao("INTEGRAL")
                .addItem("X-Salada")
                .pagarComDinheiro()
                .comTrocoPara(100)
                .entregaRetirada()
                .build();

        p3.printResumo();

        try {

            Pedido erro = new PedidoBuilder()
                    .tipoPizza()
                    .tamanhoM()
                    .addItem("Pizza Calabresa")
                    .pagarComPix()
                    .entregaRetirada()
                    .build();

        } catch (IllegalStateException e) {

            System.out.println("Erro esperado: " + e.getMessage());

        }
    }
}
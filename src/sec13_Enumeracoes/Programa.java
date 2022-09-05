package sec13_Enumeracoes;

import java.util.Date;

import entidades.ClassePedido;
import entidades.enums.StatusPedido;

public class Programa {
	
	public static void main(String[] args) {
		
		ClassePedido pedido = new ClassePedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);
		System.out.println(pedido.toString());
	}

}

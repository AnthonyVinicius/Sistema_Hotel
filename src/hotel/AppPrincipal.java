package hotel;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
	public static void main(String[] args) {

		///Pessoas

		Funcionario pablo = new Funcionario();
		pablo.nome = "Pablo";
		pablo.rg = "131213";
		pablo.setSetor("Recepção");

		//Hotel
		Hotel hotel = new Hotel();
		hotel.setNome("PousadaAlivio");

		///Quartos
		Quarto quarto1 = new Quarto();
		quarto1.setHotel(hotel);
		quarto1.setTipo("Simples");
		quarto1.setNumeroDoQuarto(243);

		Quarto quarto2 = new Quarto();
		quarto2.setHotel(hotel);
		quarto2.setTipo("Duplo");
		quarto2.setNumeroDoQuarto(295);

		List <Quarto> listaDeQuartos1 = new ArrayList<Quarto>();
		listaDeQuartos1.add(quarto1);
		listaDeQuartos1.add(quarto2);

		Quarto quarto3 = new Quarto();
		quarto3.setHotel(hotel);
		quarto3.setTipo("Simples");
		quarto3.setNumeroDoQuarto(95);

		Quarto quarto4 = new Quarto();
		quarto4.setHotel(hotel);
		quarto4.setTipo("Duplo");
		quarto4.setNumeroDoQuarto(152);

		List <Quarto> listaDeQuartos2 = new ArrayList<Quarto>();
		listaDeQuartos2.add(quarto3);
		listaDeQuartos2.add(quarto4);

		///Reservas
		Reserva reserva1 = new Reserva();
		reserva1.setData("25/09/2023");
		reserva1.setListaQuarto(listaDeQuartos1);
		reserva1.setFuncionario(pablo);

		Reserva reserva2 = new Reserva();
		reserva2.setData("25/09/2023");
		reserva2.setListaQuarto(listaDeQuartos2);
		reserva2.setFuncionario(pablo);

		List <Reserva> listaDeReserva = new ArrayList<Reserva>();
		listaDeReserva.add(reserva1);
		listaDeReserva.add(reserva2);

		Cliente cliente_joao = new Cliente();
		cliente_joao.nome = "João";
		cliente_joao.rg = "23512";
		cliente_joao.setQuantidadeOcupacoes(1);
		cliente_joao.setListaDeReserva(listaDeReserva);
		///Prints
		for(Reserva reservaPronta: cliente_joao.getListaDeReserva()) {
			System.out.println(reservaPronta.getFuncionario().getNome());
			System.out.println(reservaPronta.getData());
			System.out.println("_____________________________");
			for(Quarto quartosReservados: reservaPronta.getListaQuarto()) {
				System.out.println(quartosReservados.getHotel().getNome());
				System.out.println(quartosReservados.getNumeroDoQuarto());
				System.out.println(quartosReservados.getTipo());
				System.out.println("__________________________________");
			}
		}

	}
}


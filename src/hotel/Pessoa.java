package hotel;

import java.util.List;

public class Pessoa {
	///Atributos
	protected List <Reserva> listaDeReserva;
	protected String nome;
	protected String rg;

	///Métodos

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	public Pessoa(List<Reserva> listaDeReserva, String nome, String rg) {
		super();
		this.listaDeReserva = listaDeReserva;
		this.nome = nome;
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public List<Reserva> getListaDeReserva() {
		return listaDeReserva;
	}
	public void setListaDeReserva(List<Reserva> listaDeReserva) {
		this.listaDeReserva = listaDeReserva;
	}

}

package hotel;

import java.util.List;

public class Reserva {
	private String data;
	private List <Quarto> listaQuarto;
	private Funcionario funcionario;
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public List<Quarto> getListaQuarto() {
		return listaQuarto;
	}

	public void setListaQuarto(List<Quarto> listaQuarto) {
		this.listaQuarto = listaQuarto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(String data) {
		super();
		this.data = data;
	}

}

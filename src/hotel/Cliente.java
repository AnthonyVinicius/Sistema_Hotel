package hotel;

public class Cliente extends Pessoa {
	private int quantidadeOcupacoes;

	public int getQuantidadeOcupacoes() {
		return quantidadeOcupacoes;
	}

	public void setQuantidadeOcupacoes(int quantidadeOcupacoes) {
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int quantidadeOcupacoes) {
		super();
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}
}

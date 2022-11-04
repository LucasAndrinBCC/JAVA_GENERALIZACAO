package Ambiente;

public class Quarto extends Ambiente {
	
	private int capacidade;
	
	public Quarto(float area, int capacidade) {
		super(area);
		setCapacidade(capacidade);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Quarto [getCapacidade()=");
		builder.append(getCapacidade());
		builder.append("]");
		return builder.toString();
	}
	
}

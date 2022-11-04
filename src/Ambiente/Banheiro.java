package Ambiente;

public class Banheiro extends Ambiente {
	
	private boolean banheira;
	
	public Banheiro(float area, boolean banheira) {
		super(area);
		setBanheira(banheira);
	}

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Banheiro [isBanheira()=");
		builder.append(isBanheira());
		builder.append("]");
		return builder.toString();
	}
	
}

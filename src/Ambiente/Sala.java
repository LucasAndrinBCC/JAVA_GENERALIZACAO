package Ambiente;

public class Sala extends Ambiente {
	
	private boolean tv;
	
	public Sala(float area, boolean tv) {
		super(area);
		setTv(tv);
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Sala [isTv()=");
		builder.append(isTv());
		builder.append("]");
		return builder.toString();
	}
	
	
}

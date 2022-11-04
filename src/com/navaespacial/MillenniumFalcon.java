package com.navaespacial;

public class MillenniumFalcon extends Apolo11 {
	
	private float classeHiperpropulsor;
	
	public MillenniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		setClasseHiperpropulsor(classeHiperpropulsor);
	}

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("MillenniumFalcon [getClasseHiperpropulsor()=");
		builder.append(getClasseHiperpropulsor());
		builder.append("]");
		return builder.toString();
	}
	
}

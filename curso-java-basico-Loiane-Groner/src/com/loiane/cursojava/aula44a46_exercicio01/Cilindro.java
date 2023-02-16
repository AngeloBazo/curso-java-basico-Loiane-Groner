package com.loiane.cursojava.aula44a46_exercicio01;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

	private double areaDaBase;
	private double areaLateral;
	private double areaTotal;
	private double alturaDoCilindro;
	private double raioDaBase;
	private double volumeDoCilindro;
 	
	
	public double getVolumeDoCilindro() {
		return volumeDoCilindro;
	}

	public void setVolumeDoCilindro(double volumeDoCilindro) {
		this.volumeDoCilindro = volumeDoCilindro;
	}

	public double getAlturaDoCilindro() {
		return alturaDoCilindro;
	}

	public void setAlturaDoCilindro(double alturaDoCilindro) {
		this.alturaDoCilindro = alturaDoCilindro;
	}

	public double getRaioDaBase() {
		return raioDaBase;
	}

	public void setRaioDaBase(double raioDaBase) {
		this.raioDaBase = raioDaBase;
	}

	public double getAreaDaBase() {
		return areaDaBase;
	}

	public void setAreaDaBase(double areaDaBase) {
		this.areaDaBase = areaDaBase;
	}

	public double getAreaLateral() {
		return areaLateral;
	}

	public void setAreaLateral(double areaLateral) {
		this.areaLateral = areaLateral;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	@Override
	public void calcularArea() {

		this.areaDaBase = 3.14 * (this.raioDaBase * this.raioDaBase);

		this.areaLateral = (2 * 3.14) * this.raioDaBase * this.alturaDoCilindro;

		this.areaTotal = (2 * this.areaDaBase) + this.areaLateral;
		
		System.out.println("Área total: " + this.areaTotal);
		
	}

	@Override
	public void calcularVolume() {

		this.volumeDoCilindro = 3.14 * (this.raioDaBase * this.raioDaBase)*this.alturaDoCilindro;

		System.out.println("Volume: " + this.volumeDoCilindro);
		
	}

}

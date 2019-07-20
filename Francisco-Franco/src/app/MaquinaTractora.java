package app;

public class MaquinaTractora {

	private int id; // Agrego este atributo para poder comparar las máquinas tractoras
	private float fuerzaDeCarga;
	private Operario coductor;

	/**
	 * @param fuerzaDeCarga
	 * @param coductor
	 */
	public MaquinaTractora(int id, float fuerzaDeCarga, Operario coductor) {
		super();
		this.id = id;
		this.fuerzaDeCarga = fuerzaDeCarga;
		this.coductor = coductor;
	}

	public int getId() {
		return id;
	}

	public float getFuerzaDeCarga() {
		return fuerzaDeCarga;
	}

	public void setFuerzaDeCarga(float fuerzaDeCarga) {
		this.fuerzaDeCarga = fuerzaDeCarga;
	}

	public Operario getCoductor() {
		return coductor;
	}

	public void setCoductor(Operario coductor) {
		this.coductor = coductor;
	}

	@Override
	public String toString() {
		return "MaquinaTractora [fuerzaDeCarga=" + fuerzaDeCarga + ", coductor=" + coductor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MaquinaTractora other = (MaquinaTractora) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

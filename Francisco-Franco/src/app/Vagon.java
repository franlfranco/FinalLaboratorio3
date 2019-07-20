package app;

public class Vagon {

	private int id; // Agrego este atributo para poder comparar los vagones
	private float capacidadMaxima;
	private float capacidadActual;

	/**
	 * @param capacidadMaxima
	 * @param capacidadActual
	 */
	public Vagon(int id, float capacidadMaxima, float capacidadActual) {
		super();
		this.id = id;
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
	}

	public int getId() {
		return id;
	}

	public float getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(float capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public float getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(float capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public float calcularCargaDisponible() {
		return getCapacidadMaxima() - getCapacidadActual();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagon other = (Vagon) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vagon [id=" + id + ", capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual
				+ "]";
	}
}

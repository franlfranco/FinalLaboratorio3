package app;

import java.util.ArrayList;
import java.util.List;

public class Tren {

	private int id;
	private int matricula;
	private Jefe jefe;
	private MaquinaTractora maquina;
	private List<Vagon> vagones;

	/**
	 * @param id
	 * @param matricula
	 * @param jefe
	 * @param maquina
	 * @param vagones
	 */
	public Tren(int matricula, Jefe jefe, MaquinaTractora maquina) {
		super();
		this.matricula = matricula;
		this.jefe = jefe;
		this.maquina = maquina;
		vagones = new ArrayList<Vagon>(); 
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public MaquinaTractora getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinaTractora maquina) {
		this.maquina = maquina;
	}

	public List<Vagon> getVagones() {
		return vagones;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public int getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @return cantidad de KILOS cargados en el tren
	 */
	public float calcularCargaTotal() {
		float suma = 0;
		for(Vagon v : vagones) {
			suma += v.getCapacidadActual();
		}
		return suma;
	}
	
	/**
	 * 
	 * @return cantidad de toneladas disponibles de carga
	 */
	public float calcularCargaDisponibleTotal() {
		return maquina.getFuerzaDeCarga() - (calcularCargaTotal() / 1000);
	}
	
	/**
	 * Comprueba que la maquina tenga la capacidad de mover la cantidad de peso en los vagones mas un cargamento.
	 * @param cargamentoPendiente expresado en kilos
	 * @return true si es posible cargar un nuevo cargamento.
	 */
	public boolean validarRelacionCargaPotencia(float cargamentoPendiente) {
		if((cargamentoPendiente / 1000 > calcularCargaDisponibleTotal())){
			return false;
		}
		return true;
	}
	
	public void agregarVagon(Vagon vagon) throws SobrecargaException {
		if(validarRelacionCargaPotencia(vagon.getCapacidadActual())) {
			vagones.add(vagon);
		} else {
			throw new SobrecargaException(vagon, this.calcularCargaDisponibleTotal());
		}
	}

	@Override
	public String toString() {
		return "Tren [id=" + id + ", matricula=" + matricula + ", jefe=" + jefe + ", maquina=" + maquina + ", vagones="
				+ vagones + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tren other = (Tren) obj;
		if (id != other.id)
			return false;
		if (matricula != other.matricula)
			return false;
		return true;
	}
}

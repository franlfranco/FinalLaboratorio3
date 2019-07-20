package app;

import java.util.ArrayList;
import java.util.List;

public class CompaniaFerroviaria implements IAcciones {

	private int codigoEmpresa;
	private List<Tren> trenes;
	private List<Empleado> empleados;

	/**
	 * @param codigoEmpresa
	 * @param trenes
	 * @param empleados
	 */
	public CompaniaFerroviaria(int codigoEmpresa) {
		super();
		this.codigoEmpresa = codigoEmpresa;
		trenes = new ArrayList<Tren>();
		empleados = new ArrayList<Empleado>();
	}
	
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public void listarTrenes() {
		for(Tren t : trenes) {
			System.out.println(t.toString());
		}
	}

	@Override
	public void agregar(Object obj) throws EmpleadoExistenteException {
		if(obj instanceof Empleado) {
			Empleado nuevo = (Empleado) obj;
			nuevo.setIdEmpleado(empleados.size() + 1);
			Object objeto = buscar(nuevo.getId());
			if(objeto == null) {
				empleados.add(nuevo);
			} else {
				throw new EmpleadoExistenteException();
			}
		} else if(obj instanceof Tren){
			Tren nuevoTren = (Tren) obj;
			nuevoTren.setId(trenes.size() + 2000);
			trenes.add(nuevoTren);
		}
	}

	@Override
	public Object buscar(int index) {
		if(index < 2000) {
			if(empleados.size() >= index) {
				return empleados.get(index);
			}
		} else {
			if(trenes.size() >= index - 2000) {
				return trenes.get(index);
			}
		}
		return null;
	}

	@Override
	public void quitar(Object obj) throws ElementoInexistenteException {
		if(obj instanceof Empleado) {
			Empleado aBorrarEmpleado = (Empleado) buscar(((Empleado) obj).getId());
			if(aBorrarEmpleado != null) {
				empleados.remove(aBorrarEmpleado);
			} else {
				throw new ElementoInexistenteException();
			}
		}
		if(obj instanceof Tren) {
			Tren aBorrarTren = (Tren) buscar(((Tren) obj).getId());
			if(aBorrarTren != null) {
				trenes.remove(aBorrarTren);
			} else {
				throw new ElementoInexistenteException();
			}
		}
	}

	@Override
	public String toString() {
		return "CompaniaFerroviaria [codigoEmpresa=" + codigoEmpresa + ", trenes=" + trenes + ", empleados=" + empleados
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompaniaFerroviaria other = (CompaniaFerroviaria) obj;
		if (codigoEmpresa != other.codigoEmpresa)
			return false;
		return true;
	}
}

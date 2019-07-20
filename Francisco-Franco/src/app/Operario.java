package app;

public class Operario extends Empleado {

	private int hrsDisponibles;
	
	public Operario(int dni, String nombre, String apellido, int hrsDisponibles) {
		super(dni, nombre, apellido);
		this.hrsDisponibles = hrsDisponibles;
	}

	public int getHrsDisponibles() {
		return hrsDisponibles;
	}

	public void setHrsDisponibles(int hrsDisponibles) {
		this.hrsDisponibles = hrsDisponibles;
	}
	
	@Override
	public String toString() {
		return "Operario " + super.toString() + " hrsDisponibles=" + hrsDisponibles + "]";
	}
}

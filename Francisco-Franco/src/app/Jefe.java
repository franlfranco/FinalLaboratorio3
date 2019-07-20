package app;

public class Jefe extends Empleado{

	private int telefono;
	
	public Jefe(int dni, String nombre, String apellido, int telefono) {
		super(dni, nombre, apellido);
		this.telefono = telefono;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Jefe " + super.toString() + " telefono=" + telefono + "]";
	}
}
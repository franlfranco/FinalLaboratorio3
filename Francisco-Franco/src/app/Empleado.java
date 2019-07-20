package app;

public abstract class Empleado {

	protected int id;
	protected int dni;
	protected String nombre;
	protected String apellido;

	/**
	 * @param id
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Empleado(int dni, String nombre, String apellido) {
		super();
		this.id = 0;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setIdEmpleado(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (dni != other.dni)
			return false;
		return true;
	}
}

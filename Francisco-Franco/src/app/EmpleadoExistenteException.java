package app;

public class EmpleadoExistenteException extends Exception {

	public EmpleadoExistenteException() {
		super();
	}

	@Override
	public String getMessage() {
		return "El empleado se encuentra registrado";
	}
}

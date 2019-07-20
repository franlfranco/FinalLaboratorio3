package app;

public class ElementoInexistenteException extends Exception {

	public ElementoInexistenteException() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "El elemento que desea eliminar no existe.";
	}
}

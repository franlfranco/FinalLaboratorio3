package app;

public interface IAcciones {

	void agregar(Object obj) throws EmpleadoExistenteException;
	Object buscar(int index);
	void quitar(Object obj) throws ElementoInexistenteException;
}

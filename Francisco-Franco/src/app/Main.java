package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		CompaniaFerroviaria compania = new CompaniaFerroviaria(1);
		Empleado jefe = new Jefe(123456, "Juan", "Perez", 123345);
		Empleado operario = new Operario(987567, "Roberto", "Leitao", 200);
		MaquinaTractora maq1 = new MaquinaTractora(1, 1, (Operario) operario);
		MaquinaTractora maq2 = new MaquinaTractora(2, 2, (Operario) operario);
		Vagon vagon1 = new Vagon(1, 200, 200);
		Vagon vagon2 = new Vagon(2, 400, 400);
		Vagon vagon3 = new Vagon(3, 200, 200);
		Vagon vagon4 = new Vagon(4, 400, 400);
		Tren tren1 = new Tren(123, (Jefe) jefe, maq1);
		Tren tren2 = new Tren(456, (Jefe) jefe, maq2);
		
		try {
			compania.agregar(operario);
			compania.agregar(jefe);
			
			tren1.agregarVagon(vagon1);
			tren1.agregarVagon(vagon2);
			tren1.agregarVagon(vagon3);
			//tren1.agregarVagon(vagon4);
			
			compania.agregar(tren1);
		} catch (SobrecargaException | EmpleadoExistenteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(compania.toString());
		
	}
}

package app;

public class SobrecargaException extends Exception {

	Vagon vagon;
	float cargaDisponible;
	
	public SobrecargaException(Vagon vagon, float cargaDisponible) {
		super();
		this.cargaDisponible = cargaDisponible;
		this.vagon = vagon;
	}

	@Override
	public String getMessage() {
		return "El vagon " + vagon.getId() + " contiene un cargamento superior a " + cargaDisponible + " toneladas";
	}
}

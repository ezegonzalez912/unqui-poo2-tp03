package ar.unq.tp3.ej09;

public class Validacion {

	private Boolean validacion;
	private String message;
	
	public Validacion(String message, Boolean validacion) {
		
		this.validacion = validacion;
		this.message = message;
		
	}
	
	public String getMessage() {
		return message;
	}
	
	public Boolean getValidacion() {
		return validacion;
	}
	
}

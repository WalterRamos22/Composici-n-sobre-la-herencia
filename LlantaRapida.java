package componentes;

public class LlantaRapida {
	
	private Encender encender;

	public LlantaRapida(Encender encender) {
		this.encender = encender;
		// TODO Auto-generated constructor stub
	}
	
	public void arrancar() {
		encender.arrancar();
	}
			
}

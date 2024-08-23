package componentes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Llantas llantas = new Llantas();
		Motor motor = new Motor();
		llantas.arrancar();
		motor.arrancar();
		
		LlantaRapida llantarapida = new LlantaRapida(llantas);
		llantarapida.arrancar();

	}

}

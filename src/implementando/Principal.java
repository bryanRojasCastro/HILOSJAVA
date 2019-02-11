package implementando;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloImplentado hilo = new HiloImplentado();
		  /*hilo.start();  no sera invocado ya que nunca se heredo de la clase
		por ende no heredamos sus metodos*/
		
		Thread miHilo = new Thread(hilo);
		miHilo.start();
	}

}

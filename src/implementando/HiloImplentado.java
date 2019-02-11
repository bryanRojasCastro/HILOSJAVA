package implementando;

public class HiloImplentado implements Runnable{

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+Thread.currentThread().getName());
			
			//System.out.println(i+getName);
			/* No se ha heredado la clase por lo tanto no se hereda su 
			 * metodo getName, por ende se debe hacer del uso de la clase
			 * 
			 */
		}
	}



}

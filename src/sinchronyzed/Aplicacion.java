package sinchronyzed;

public class Aplicacion {

	public static void main(String args[]){
		CajeroAutomatico caja1 = new CajeroAutomatico();
		CajeroAutomatico caja2 = new CajeroAutomatico();
		
		Thread hiloCaja1 = new Thread(caja1,"peito");
		Thread hiloCaja2 = new Thread(caja1,"juanito");
		
		hiloCaja1.start();		
		hiloCaja2.start();
	}
}

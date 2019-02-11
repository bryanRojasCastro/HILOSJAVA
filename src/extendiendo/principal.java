package extendiendo;

public class principal {
	
	public static void main(String args[]) throws InterruptedException{
		
		HiloPrincipal hilo = new HiloPrincipal("hilo.> 1");
		HiloPrincipal hilo2 = new HiloPrincipal("hilo.> 2");
		HiloPrincipal hilo3 = new HiloPrincipal("hilo.> 3");
		
		hilo.start();
		hilo.join();
		hilo2.start();
		hilo3.start();
	}
	
	

}

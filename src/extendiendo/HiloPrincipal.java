package extendiendo;

public class HiloPrincipal extends Thread {
	
	String nombre;
	public HiloPrincipal( String nombreHilo) {
		// TODO Auto-generated constructor stub
		super(nombreHilo);
		this.nombre=nombreHilo;
	}
	
	public void run(){
		if(nombre.equalsIgnoreCase("hilo.> 1")){
			System.out.println(
			"primero se ejecuta el hilo 1 ya que es el que tiene el join"+
			" los otros dos ya al azar");
		}		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+Thread.currentThread().getName());
			
		}				
	}
}

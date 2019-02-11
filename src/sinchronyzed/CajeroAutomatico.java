package sinchronyzed;

public class CajeroAutomatico implements Runnable {
	
	CuentaBancaria miCuenta = new CuentaBancaria();
	
	public void run() {
		for (int i = 0; i <5; i++) {
			try{
				retirarDineroCuenta(10);
				if(miCuenta.getSaldoActual()<0){
					System.out.println("Su  ceunta posee saldo negativo");
				}
			Thread.sleep(500);
			
			}catch (InterruptedException e){
				e.printStackTrace();
			}			
		}
	}

	private synchronized void retirarDineroCuenta(int valorRetiro) {
		// TODO Auto-generated method stub
		if(miCuenta.getSaldoActual()>=valorRetiro){
			System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
			System.out.println("El usuario: "+Thread.currentThread().getName()+" esta retirando: "+valorRetiro);
			miCuenta.retiroDeCuenta(valorRetiro);
			System.out.println("el retiro se realizo exitosamente");
			System.out.println("nuvo saldo es: "+miCuenta.getSaldoActual());
		}else{
			System.out.println("Señor: "+Thread.currentThread().getName()+" No hay saldo en la cuenta");
			
		}
		
	}
	
	
 

}

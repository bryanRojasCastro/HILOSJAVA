package sinchronyzed;

public class CuentaBancaria {

	private int saldoActual=50;

	public int getSaldoActual() {
		return saldoActual;
	}

	/*public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
	solo metodo get ya que no le colocaremos saldo a esta cuenta simplemente retiraremos saldo
	*/

	public void retiroDeCuenta(int valorRetiro) {
		// TODO Auto-generated method stub
		saldoActual -= valorRetiro;
	}
}

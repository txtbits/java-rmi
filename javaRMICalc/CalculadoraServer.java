import java.rmi.Naming;

public class CalculadoraServer {

	public CalculadoraServer() {
		try {
			Calculadora c = new CalculadoraImpl();
			Naming.rebind("rmi://localhost/CalculadoraService", c);
		} 
		catch (Exception e)	{
			System.out.println("Problema: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculadoraServer();
	}
}

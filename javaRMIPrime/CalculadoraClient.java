import java.rmi.Naming;
import java.rmi.RemoteException; 
import java.net.MalformedURLException;      
import java.rmi.NotBoundException; 

public class CalculadoraClient {

	public static void main(String[] args) {
		try { 
			Calculadora c = (Calculadora) 
			Naming.lookup("rmi://localhost/CalculadoraService");
			System.out.println("Primo: ");
			System.out.println("3: " + c.primo(3));
			System.out.println("8: " + c.primo(8));
		} catch (MalformedURLException murle) {
			System.out.println();
			System.out.println("MalformedURLException");
			System.out.println(murle);
		} catch (RemoteException re) {
			System.out.println();
			System.out.println("RemoteException");
			System.out.println(re);
		} catch (NotBoundException nbe) {
			System.out.println();
			System.out.println("NotBoundException");
			System.out.println(nbe);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println();
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
	}

}

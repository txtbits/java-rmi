import java.rmi.Naming;
import java.rmi.RemoteException; 
import java.net.MalformedURLException;      
import java.rmi.NotBoundException; 

public class CalculadoraClient {

	public static void main(String[] args) {
		try { 
			Calculadora c = (Calculadora) 
			Naming.lookup("rmi://localhost/CalculadoraService");
			System.out.println("Suma: 5 + 9");
			System.out.println(c.sum(5, 9) );
			System.out.println("Resta: 8 - 5");
			System.out.println(c.res(8, 5) );
			System.out.println("Multiplica: 5 * 5");
			System.out.println(c.mul(5, 5) );
			System.out.println("Divide: 15 / 3");
			System.out.println(c.div(15, 3) );
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

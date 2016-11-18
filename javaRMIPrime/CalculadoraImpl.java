import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

	// Las implementaciones deben tener un constructor explícito 
	// para poder declarar la excepción RemoteException
	public CalculadoraImpl() throws RemoteException {
		super();
	} 

	public boolean primo(int a) throws RemoteException {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador!=a)) {
			if (a % contador == 0) {
				primo = false;
			}
			contador++;
		}
		return primo;
	}

}

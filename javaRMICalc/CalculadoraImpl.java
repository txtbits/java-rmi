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

	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	public int res(int a, int b) throws RemoteException {
		return a - b;
	}

	public int mul(int a, int b) throws RemoteException {
		return a * b;
	}

	public int div(int a, int b) throws RemoteException {
		return a / b;
	}

}

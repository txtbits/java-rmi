import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {

	public boolean primo(int a) throws RemoteException; 

}

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        CountRMI myCount = (CountRMI) Naming.lookup("rmi://" + args[0] + "/" + "myCountRMI");

        // Inicializando variable sum
        System.out.println("Setting Sum to 0");

        myCount.sum(0);

        // Calculando el tiempo de inicio
        long startTime = System.currentTimeMillis();

        // Incrementando 1000 veces
        System.out.println("Incrementing");

        for(int i = 0; i< 1000;i++) {
            myCount.increment();
        }

        //Calculando el tiempo de parada; imprimiendo las estadísticas
        long stopTime = System.currentTimeMillis();

        System.out.println("Avg Ping = " + ((stopTime -startTime)/1000f) +" msecs");

        System.out.println("Sum = " + myCount.sum());
    }



}

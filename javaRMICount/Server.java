import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class Server {

    public static void main(String args[]) throws MalformedURLException {
        // Create CountRMIImpl
        try {
            CountRMIImpl myCount = new CountRMIImpl("myCountRMI");
            System.out.println("CountRMI Server ready.");
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}

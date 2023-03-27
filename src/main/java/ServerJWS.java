import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {

        // demarer un serverur http sur le port 9191
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());

        System.out.println("Web service deplye sur http://0.0.0.0:9191/");




    }






}

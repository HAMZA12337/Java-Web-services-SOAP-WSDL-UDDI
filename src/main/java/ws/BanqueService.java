package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


//POJO plain old java object

@WebService(serviceName = "BanqueWs")
public class BanqueService {


    public BanqueService() {

    }

    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt) {

        return 10.54 * mt;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name="code") int code) {


        return new Compte(code, Math.random() * 192991, new Date());
    }


    @WebMethod
    public List<Compte> getListCompte() {


        return List.of(
                new Compte(1, Math.random() * 192991, new Date()),
                new Compte(2, Math.random() * 192991, new Date()),
                new Compte(3, Math.random() * 192991, new Date())
        );
    }


}

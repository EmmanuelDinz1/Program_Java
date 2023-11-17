package Application;

import Services.ContractService;
import Services.OnlinePaymentService;
import Services.PaypalService;

public class Programn {

    public static void main(String[] args) {

//                   TESTE DO PAYPALSERVICE
//      OnlinePaymentService ps = new PaypalService();
//      System.out.println(ps.interest(200.00,3));
        OnlinePaymentService ps = new PaypalService();
//                   Passar como argumento a injeção
        ContractService cs = new ContractService(ps);
    }
}

package Services;
public class ContractService implements OnlinePaymentService{

//    modo incorreto de fazer:
//    private PaypalService paymentService = new PaypalService();
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    @Override
    public Double paymentFee(Double amount) {
        return null;
    }
    @Override
    public Double interest(Double amount, Integer months) {
        return null;
    }
}

import ProductCart;
import ShoppingCart;
public class EcartBilling{

    double balance;
    public EcartBilling(double balance){
        this.balance=balance;
    }

    public double getBalance(){

        return this.balance;
    }

    public double updateBalanceAfterCart(double cartAmount){
        if (this.balance >= cartAmount){
            this.balance = this.balance - cartAmount;
        }
        else{System.out.println("Please Add Sufficient Funds to Cart");}
        return this.balance;
    }

}
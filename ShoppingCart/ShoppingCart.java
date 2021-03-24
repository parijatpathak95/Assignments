
import java.util.ArrayList;

import ProductCart;
import StockCart;
import EcartBilling;

public class ShoppingCart {

    ArrayList<ProductCart> shoppingList = new ArrayList<ProductCart>();

    public void addToCard(StockCart stockobj,ProductCart... items){
        for(ProductCart i: items) {
            boolean result =stockobj.CheckItemInStock(i);
            if (result == true){
            shoppingList.add(i);
            //System.out.println(i.productName+"  "+i.quantity+"  "+i.price );
            }
            else{System.out.println("Quality to add is not availabe in stock please reduce the quantity");}
        }
        //this.DisplayFinalCart();
    }
    public void DisplayFinalCart(){        
        System.out.println("Product Name"+"  "+"Item Quanlity"+"  "+"Price");
        shoppingList.forEach(item -> System.out.println(item.productName+"  "+item.quantity+"  "+item.price ));
        double Total;
        Total=this.getTotalBillAmountofCart();
        System.out.println("Total Price to be Paid  :"+ Total);
    }
    public ArrayList<ProductCart> getCartList() {
        shoppingList.forEach(item -> System.out.println(item.productName+"  "+item.quantity+"  "+item.price ));
        return shoppingList ;
    }

    public double getTotalBillAmountofCart(){
        double Total=0;
        for (ProductCart i: this.shoppingList){
            Total=Total+i.price;
        }
       
        return Total;

    }
    public static void main(String[] args) {
        ShoppingCart shoppingObj = new ShoppingCart(); 
        StockCart   stockobj = new StockCart(50,30,60);
        EcartBilling ecartobj = new EcartBilling(500);
        //stockobj.getStock();
        
        ProductCart appleObj1 = new ProductCart("Apple",15,55);
        ProductCart appleObj2 = new ProductCart("Newspaper",20,55);
        ProductCart appleObj3 = new ProductCart("Milk",20,55);
        shoppingObj.addToCard(stockobj,appleObj1,appleObj2,appleObj3);
        shoppingObj.DisplayFinalCart();
        double remainingBalance =ecartobj.updateBalanceAfterCart(shoppingObj.getTotalBillAmountofCart());
        
        if (remainingBalance>0){
            System.out.println("Your Order is Plced and Available balance is : "+remainingBalance);
        }

        
        
        
        
        
    }

} 
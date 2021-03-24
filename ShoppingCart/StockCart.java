import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

import ProductCart;


public class StockCart extends ShoppingCart {
    
    int AppleStock;
    int NewspaperStock;
    int MilkStock;
    //public ArrayList<ProductCart> tempshoppingList;
    
    public StockCart(int AppleStock,int NewspaperStock, int MilkStock){
            this.AppleStock=AppleStock;
            this.NewspaperStock=NewspaperStock;
            this.MilkStock=MilkStock;
        }
    public void getStock(){
        System.out.println("Apple Stock :"+this.AppleStock+"Newspaper Stock : "+this.NewspaperStock+"Milk Stock : "+this.MilkStock);
        
    }
    public boolean CheckItemInStock(ProductCart item){
        //System.out.println("In check item :"+item.productName+"  "+item.quantity+"  "+item.price );
        if (item.productName=="Apple" && item.quantity < this.AppleStock){
                return true; }
        else if (item.productName=="Newspaper" && item.quantity < this.NewspaperStock){
                    return true;      }
        else if (item.productName=="Milk" && item.quantity < this.NewspaperStock){
                    return true;   }
        else{ return false;   }                 
        
        
    }
    
    public void updateStockAfterAddingToCart(ArrayList<ProductCart> shoppingList){
        int apple=0; int newspaper=0; int milk=0;
        for (ProductCart i: shoppingList){
            if (i.productName=="Apple"){
                apple=apple+i.quantity;}
            else if (i.productName=="Newspaper"){
                newspaper=newspaper+i.quantity;}
            else{
                milk=milk+i.quantity;}
        
            }
        this.AppleStock=this.AppleStock-apple;
        //System.out.println("Update Stock of Items is as follows:");
        //this.getStock();
    }
        
        
    }


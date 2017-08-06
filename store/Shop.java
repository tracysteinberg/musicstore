
package store;
import java.util.*;
import java.util.ArrayList;



public abstract class Shop implements Sellable {
 
  
  public ArrayList<Sellable> shop;
 
  

  public Shop () {
   
  this.shop = new ArrayList<Sellable>(); 
  
  }



  public int stockCount () {

    return this.shop.size(); 

  }


  public void addStock (Sellable stock ) {

    this.shop.add(stock);

  }
  

  public void removeStock(Sellable stock) {

     this.shop.remove(stock);

  }



}



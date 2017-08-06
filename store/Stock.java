package store;

public class Stock extends Shop {


  private String name;
  private int buyPrice;
  private int sellPrice;
  private int markUp;
 



  public Stock(String name, int buyPrice, int sellPrice, int markUp) {
  
    this.name = name;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.markUp = markUp;
   
    
    }

 

  public String hasname(){
     return this.name;
  }

  public int hasbuyPrice(){
    return this.buyPrice;
 }

  public int hassellPrice(){
     return this.sellPrice;
 }

  public int hasmarkUp(int sellPrice){
     return this.sellPrice - this.buyPrice;
 }
  public int markUp() {
     return this.markUp;
   }

 




}
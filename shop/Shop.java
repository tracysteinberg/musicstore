// package instruments;
package shop;

public abstract class Shop implements  Sellable{

  public int buyPrice;
  public int sellPrice;
  public int markUp;



  public Shop(int buyPrice, int sellPrice, int markUp) {
  this.buyPrice = buyPrice;
  this.sellPrice = sellPrice;
  this.markUp = markUp;

 }



}



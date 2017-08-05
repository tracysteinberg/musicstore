// package instruments;
package shop;

public abstract class Shop implements  Sellable{

  public String name;
  public int buyPrice;
  public int sellPrice;
  public int markUp;



  public Shop(String name, int buyPrice, int sellPrice, int markUp) {
  this.name = name;
  this.buyPrice = buyPrice;
  this.sellPrice = sellPrice;
  this.markUp = markUp;

 }





}



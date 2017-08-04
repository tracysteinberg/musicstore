package instruments;

public abstract class Instrument implements Playable {

  public String maker;
  // private String InstrumentType instrumentType;
  public String material;
  public String colour;
  // private double buyingPrice;
  // private double sellingPrice;


  public Instrument (String maker, String material, String colour) {
  this.maker = maker;
  //   this.instrumentType = InstrumentType;
  this.material = material;
  this.colour = colour;

  //   // this.buyingPrice = BuyingPrice;
  //   // this.sellingPrice = SellingPrice;
  
 }

}



package instruments;


public class Clarinet extends Instrument {

  private String reedType;
  //   super( stringType );

  public Clarinet(String maker, String material, String colour, String reedType) {
    super(maker,  material,  colour);
    this.reedType = reedType;
    this.maker = maker;
    this.material = material;
    this.colour = colour;
    // this.buyingPrice = buyingPrice;
    // this.sellingPrice = sellingPrice;

   }

  public String hasreedType(){
    return this.reedType;
   }

  public String play() {
     return "Brrrr!";
   }
 
   public String hasMaker (){
    return this.maker;
   }

   public String hasMaterial(){
    return this.material;
   }

   public String hasColour(){
     return this.colour;
   }



  //  public Double hasbuyingPrice(){
  //    return this.buyingPrice;
  // }

  //  public Double hassellingPrice(){
  //    return this.sellingPrice;
  // }


}


// public class Guitar {
//   FENDER,
//   STRING,
//   ASH,
//   LIGHT,
//   750,
//   1500;


// }
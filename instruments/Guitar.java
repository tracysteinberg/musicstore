package instruments;


public class Guitar extends Instrument {

  private String stringType;
  //   super( stringType );




  public Guitar(String maker, String material, String colour, String stringType) {
    super(maker,  material,  colour);
    this.stringType = stringType;
    this.maker = maker;
    this.material = material;
    this.colour = colour;
    
  }

  public String hasstringType(){
    return this.stringType;
  }

  public String play(){
  	return ("Strum!");
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



}






// public class Guitar {
//   FENDER,
//   STRING,
//   ASH,
//   LIGHT,
//   750,
//   1500;


// }
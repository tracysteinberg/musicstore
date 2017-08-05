package instruments;

public abstract class Instrument implements Playable {

  public String maker;
  public String material;
  public String colour;
  
  public Instrument (String maker, String material, String colour) {
  this.maker = maker;
  this.material = material;
  this.colour = colour;


  
 }

}



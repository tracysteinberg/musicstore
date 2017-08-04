package jewellery;

public class Ring {

  private MetalType metal;
  private GemType gemType;

  public Ring(MetalType metal, GemType gem) {
    this.metal = metal;
    this.gemType = gem;
  }

  public MetalType getMetal(){
    return this.metal;
  }

  public GemType getGemType(){
    return this.gemType;
  }

}
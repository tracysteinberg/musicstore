import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class GuitarTest {

  Guitar guitar;
  
  @Before 
  public void before() {
    guitar = new Guitar("Fender", "Ash", "Light", "Metal");
  
  
  }

  @Test
   public void canGetstringType(){
    assertEquals("Metal",guitar.hasstringType());
  }


  @Test
   public void canPlay(){

    assertEquals("Strum!",guitar.play());
   }


  @Test
   public void canGetMaker(){
    assertEquals("Fender",guitar.hasMaker());
  }


  @Test
    public void canGetMaterial(){
    assertEquals("Ash",guitar.hasMaterial());
  }

  @Test
  public void canGetColour(){
    assertEquals("Light", guitar.hasColour());
  }

  // @Test
  // public void canBuyingPrice(){
  //   assertEquals(750, guitar.hasBuyingPrice());
  // }
  
  // @Test
  // public void canSellingPrice(){
  //   assertEquals(1500, guitar.hasSellingPrice());
  // }


}
  
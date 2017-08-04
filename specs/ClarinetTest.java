import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class ClarinetTest {

  Clarinet clarinet;
  
  @Before 
  public void before() {
    clarinet = new Clarinet("JohnPacker", "Ebonite", "Black", "American");
  
  
  }

  @Test
   public void canGetreedType(){
    assertEquals("American",clarinet.hasreedType());
  }

  @Test
   public void canPlay(){

    assertEquals("Brrrr!",clarinet.play());
   }

  @Test
   public void canGetMaker(){
    assertEquals("JohnPacker",clarinet.hasMaker());
  }


  @Test
    public void canGetMaterial(){
    assertEquals("Ebonite",clarinet.hasMaterial());
  }

  @Test
    public void canGetColour(){
    assertEquals("Black", clarinet.hasColour());
  }

  // @Test
  // public void canBuyingPrice(){
  //   assertEquals(46, clarinet.hasBuyingPrice());
  // }
  
  // @Test
  // public void canSellingPrice(){
  //   assertEquals(92, clarinet.hasSellingPrice());
  // }

}
  
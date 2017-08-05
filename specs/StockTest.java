
import static org.junit.Assert.*;
import org.junit.*;
import shop.*;


public class StockTest {

  Stock stock;

  
  
  @Before 
  public void before() {
    stock = new Stock("clarinet", 46, 92, 46);
  

   }

    @Test
    public void getname() {
     assertEquals("clarinet", stock.hasname());
    }

   

    @Test
     public void getbuyPrice(){
     assertEquals(46, stock.hasbuyPrice());
    }
  
    @Test
     public void getsellPrice(){
     assertEquals(92, stock.hassellPrice());
    }

     @Test
     public void getmarkUp(){
     assertEquals(46, stock.hasmarkUp(92));
    }



    // @Test
    //   public void canBuyPrice(){
    //   assertEquals(750, guitar.hasBuyPrice());
    // }
  
    // @Test
    //    public void canSellPrice(){
    //    assertEquals(1500, guitar.hasSellPrice());
    // }

}
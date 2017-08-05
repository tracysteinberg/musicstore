
import static org.junit.Assert.*;
import org.junit.*;
import store.*;


public class StockTest {

  Stock stock;
  Sellable sellable;



  
    @Before 
      public void before() {
      stock = new Stock("clarinet", 46, 92, 46, 0);

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


     @Test
     public void canmarkUp(){
 
      assertEquals(46,stock.markUp());
    
    }




}
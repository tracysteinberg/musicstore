
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import store.*;


public class ShopTest {
  

  Shop shop;
  Stock stock;
  Sellable sellable;
  MusicSheet musicSheet;
  
    

   @Before 
   public void before() {

     stock = new Stock("clarinet", 46, 92, 46);
     musicSheet = new MusicSheet();
     
    }  


    @Test
      public void shopStartEmpty() {
      assertEquals(0, stock.stockCount());


     }


     @Test
       public void canAddStock() {
       stock.addStock( musicSheet );
       assertEquals(1, stock.stockCount());

       }
    

    
     @Test
       public void canRemoveStock() {
         stock.addStock(musicSheet);
         stock.removeStock(musicSheet);
         assertEquals(0, stock.stockCount());

      }

}


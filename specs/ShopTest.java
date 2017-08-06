
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import store.*;


public class ShopTest {
  

  Shop shop;
  Stock stock;
  Sellable sellable;

    

   @Before 
   public void before() {

     stock = new Stock("clarinet", 46, 92, 46);
     
    }  



    @Test
      public void shopStartEmpty() {
      assertEquals(0, shop.stockCount());


     }




     @Test
       public void canAddStock() {
       shop.addStock( stock );
       assertEquals(1, shop.stockCount());

       }
    

    
     @Test
       public void canRemoveStock() {
         shop.addStock(stock);
         shop.removeStock(stock);
         assertEquals(0, shop.stockCount());

      }

}


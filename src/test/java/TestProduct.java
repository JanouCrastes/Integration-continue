import org.junit.Assert;
import org.junit.Test;
import src.Product;

public class TestProduct {
        @Test
        public void insertProduct()
        {
            Product product=new Product();
            product.setName("voiture");
            product.setPrix(1500);
            product.setId(1);
            Assert.assertEquals("voiture",product.getName());
            Assert.assertEquals(1,product.getId());
            Assert.assertEquals(1500,product.getPrix());



            /*Product product=new Product();
            product.setName("voiture");
            product.setPrix(1500);
            Assert.assertEquals("voiture",product.getName());*/

        }
    }

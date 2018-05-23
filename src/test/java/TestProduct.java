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
            Assert.assertEquals("voiture",product.getName());

            /*Product product=new Product();
            product.setName("voiture");
            product.setPrix(1500);
            Assert.assertEquals("voiture",product.getName());*/

        }
    }

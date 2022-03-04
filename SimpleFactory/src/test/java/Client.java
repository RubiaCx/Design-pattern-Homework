import Factory.DAO.Product;
import Factory.DAO.Factory;
import Factory.Utils.Print;
import org.junit.jupiter.api.Test;

public class Client{
    @Test
    public void test1(){
        Product product = Factory.DrawShape();
        Print p = new Print();
        product.draw(p.getGraph());
        try {
            Thread.sleep(4000); //休眠4s后擦去图像
            product.erase(p.getGraph());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
